# Seven segment mappings for digits and operators
SEGMENTS = {
    '0': [' _ ', '| |', '|_|'],
    '1': ['   ', '  |', '  |'],
    '2': [' _ ', ' _|', '|_ '],
    '3': [' _ ', ' _|', ' _|'],
    '4': ['   ', '|_|', '  |'],
    '5': [' _ ', '|_ ', ' _|'],
    '6': [' _ ', '|_ ', '|_|'],
    '7': [' _ ', '  |', '  |'],
    '8': [' _ ', '|_|', '|_|'],
    '9': [' _ ', '|_|', ' _|'],
    '+': ['   ', ' _|', '  |'],
    '-': ['   ', ' _ ', '   '],
    '%': [' _ ', ' _|', '  |'],
    '=': ['   ', '|_|', '|_|']
}

# Function to convert 3x3 segment grid into a character
def find_character(display):
    # Normalize display to a tuple
    display_tuple = tuple(display)
    for char, segments in SEGMENTS.items():
        if display_tuple == tuple(segments):
            return char
    return None

# Function to simulate the equation from the input
def check_equation(equation):
    try:
        return eval(equation)
    except:
        return False

def solve_faulty_segment(N, display):
    # The equation we need to extract from the display
    equation = []
    
    # Split the input into rows
    rows = [display[0], display[1], display[2]]
    
    # Split the input rows into groups of 3 for each character
    for i in range(0, len(rows[0]), 3):
        # Extract the 3x3 segment for each character
        char_display = [rows[0][i:i+3], rows[1][i:i+3], rows[2][i:i+3]]
        char = find_character(char_display)
        equation.append(char)
    
    # Join the extracted characters to form the equation string
    equation_str = ''.join(equation)
    
    # Check if the equation is correct
    if check_equation(equation_str.split('=')[0]) == int(equation_str.split('=')[1]):
        return None

    for i in range(len(equation)):
        # Try toggling each character in the equation and check if it fixes the equation
        original_char = equation[i]
        for new_char, segments in SEGMENTS.items():
            if original_char != new_char:
                equation[i] = new_char
                new_equation_str = ''.join(equation)
                if check_equation(new_equation_str.split('=')[0]) == int(new_equation_str.split('=')[1]):
                    return i + 1
        # Restore the original character after the test
        equation[i] = original_char

# Example usage:
N = 5
display = [
    "       _     _ ",
    "  ||_  _| _ |_|",
    "  ||  |_  _  _|"
]

print(solve_faulty_segment(N, display))