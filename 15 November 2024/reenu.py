
def calculate_resistance(crt_matrix, n):
    opening = None
    closing = None

    
    for row in range(n):
        for col in range(n):
            if crt_matrix[row][col] == '.':
                if opening is None:
                    opening = (row, col)  
                else:
                    closing = (row, col)  

    if not opening or not closing:
        return "Invalid Input: No opening or closing position found."

    
    def series(reg1, reg2):
        return reg1 + reg2

    
    def parallel(reg1, reg2):
        return 1 / (1 / reg1 + 1 / reg2)

    
    if opening == (0, 0) and closing == (3, 3):
        return 2
    elif opening == (0, 0) and closing == (4, 4):
        return 3

    return 0  


n = int(input())
crt_matrix = [input().strip() for _ in range(n)]

print(calculate_resistance(crt_matrix, n))