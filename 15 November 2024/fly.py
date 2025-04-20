def count_flyovers(N, lanes):
    # Dictionaries to store horizontal and vertical lanes
    horizontalLanes = {}
    verticalLanes = {}
    
    # Classify lanes into horizontal and vertical
    for lane in lanes:
        x1, y1, x2, y2 = lane
        
        if y1 == y2:  # Horizontal lane
            if y1 not in horizontalLanes:
                horizontalLanes[y1] = []
            horizontalLanes[y1].append((min(x1, x2), max(x1, x2)))  # Store x-range for horizontal lane
        
        elif x1 == x2:  # Vertical lane
            if x1 not in verticalLanes:
                verticalLanes[x1] = []
            verticalLanes[x1].append((min(y1, y2), max(y1, y2)))  # Store y-range for vertical lane
    
    # Count intersections (flyovers)
    flyovers = 0
    
    # Iterate over each horizontal lane at a particular y-coordinate
    for y in horizontalLanes:
        for (x1, x2) in horizontalLanes[y]:
            # Iterate over each x-coordinate in the horizontal lane's range
            for x in range(x1, x2 + 1):
                # Check if there's a vertical lane at x that intersects at y
                if x in verticalLanes:
                    for (y1, y2) in verticalLanes[x]:
                        if y1 <= y <= y2:  # Check if y is within the vertical lane's y-range
                            flyovers += 1
    
    return flyovers


# Test with the provided examples:

# Example 1
lanes_1 = [
    [3, 2, 1, 2],
    [5, 5, 3, 5],
    [0, 3, 6, 3],
    [5, 2, 5, 6],
    [2, 1, 2, 4]
]
N_1 = 5
print(count_flyovers(N_1, lanes_1))  # Expected output: 3

# Example 2
lanes_2 = [
    [2, 10, 2, 3],
    [8, 8, 0, 8],
    [5, 12, 5, 2],
    [2, 2, 5, 2],
    [4, 0, 4, 8],
    [8, 5, 1, 5],
    [8, 15, 0, 15]
]
N_2 = 7
print(count_flyovers(N_2, lanes_2))  # Expected output: 6
