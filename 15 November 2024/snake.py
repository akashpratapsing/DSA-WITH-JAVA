def simulate_path(start, dice_rolls, board):
    position = start
    for roll in dice_rolls:
        position += roll
        # Overshooting is capped at 100
        if position > 100:
            position = 100
        
        # Follow the snake or ladder immediately, if present
        while position in board:
            position = board[position]
    
    return position

def main():
    # Read number of snakes and ladders
    N = int(input())
    board = {}
    
    # Read the positions of snakes and ladders
    for _ in range(N):
        start, end = map(int, input().split())
        board[start] = end

    # Read dice rolls
    dice_rolls = list(map(int, input().split()))
    target_position = dice_rolls.pop()  # The last input is the target position

    # Step 1: Simulate without any changes
    if simulate_path(1, dice_rolls, board) == target_position:
        print("Not affected")
        return

    # Step 2: Try switching each snake/ladder
    for start, original_end in board.items():
        # Reverse the snake/ladder behavior
        board[start] = 2 * start - original_end
        
        # Simulate the new path
        if simulate_path(1, dice_rolls, board) == target_position:
            if original_end > start:
                print(f"Snake {start} {original_end}")
            else:
                print(f"Ladder {start} {original_end}")
            return
        
        # Restore the original behavior
        board[start] = original_end

    # Step 3: If no configuration works, print "Not reachable"
    print("Not reachable")

# Execute the main function
if __name__ == "__main__":
    main()
