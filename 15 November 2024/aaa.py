import math
from collections import defaultdict

def main():
    # Read number of sticks
    N = int(input())
    sticks = []
    
    # Read all sticks' coordinates
    for _ in range(N):
        x1, y1, x2, y2 = map(int, input().split())
        sticks.append((x1, y1, x2, y2))
    
    is_closed, polygon = is_closed_polygon(sticks)
    if not is_closed:
        print("No")
        return
    
    # If closed polygon is formed
    print("Yes")
    area = calculate_area(polygon)
    leftover_sticks = get_leftover_sticks(sticks, polygon)
    can_replicate = can_replicate(leftover_sticks, area)
    print("Yes" if can_replicate else "No")
    print(f"{area:.2f}")
    

def is_closed_polygon(sticks):
    # Map of point coordinates to the number of times they occur
    point_degrees = defaultdict(int)
    
    # Count how many times each point occurs in the sticks
    for (x1, y1, x2, y2) in sticks:
        point_degrees[(x1, y1)] += 1
        point_degrees[(x2, y2)] += 1
    
    # A closed figure must have each point occur an even number of times
    for degree in point_degrees.values():
        if degree % 2 != 0:
            return False, []
    
    # Extract the polygon vertices (cycle) by traversing the points
    visited = set()
    polygon = []
    
    def dfs(point, path):
        visited.add(point)
        path.append(point)
        
        for (x1, y1, x2, y2) in sticks:
            if (x1, y1) == point and (x2, y2) not in visited:
                if dfs((x2, y2), path):
                    return True
            elif (x2, y2) == point and (x1, y1) not in visited:
                if dfs((x1, y1), path):
                    return True
        return False
    
    start = next(iter(point_degrees))  # Start from any point
    if not dfs(start, polygon):
        return False, []
    
    return True, polygon


def calculate_area(polygon):
    # Using the shoelace formula to calculate the area of the polygon
    n = len(polygon)
    area = 0
    for i in range(n):
        x1, y1 = polygon[i]
        x2, y2 = polygon[(i + 1) % n]
        area += x1 * y2 - x2 * y1
    return abs(area) / 2


def get_leftover_sticks(sticks, polygon):
    polygon_set = set(polygon)
    leftover = []
    
    for (x1, y1, x2, y2) in sticks:
        if (x1, y1) not in polygon_set or (x2, y2) not in polygon_set:
            leftover.append((x1, y1, x2, y2))
    
    return leftover


def can_replicate(leftover_sticks, target_area):
    # Check if the leftover sticks can form a polygon with the same area
    leftover_area = 0
    
    if len(leftover_sticks) < 3:
        return False
    
    leftover_points = set()
    for (x1, y1, x2, y2) in leftover_sticks:
        leftover_points.add((x1, y1))
        leftover_points.add((x2, y2))
    
    leftover_points = list(leftover_points)
    n = len(leftover_points)
    
    if n < 3:
        return False
    
    leftover_area = 0
    for i in range(n):
        x1, y1 = leftover_points[i]
        x2, y2 = leftover_points[(i + 1) % n]
        leftover_area += x1 * y2 - x2 * y1
    
    leftover_area = abs(leftover_area) / 2
    
    return math.isclose(leftover_area, target_area)


if __name__ == "__main__":
    main()
