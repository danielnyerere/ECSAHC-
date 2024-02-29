# Open the file for reading

with open("numbers.txt", "r") as file:

# Read the contents of the file into a list

numbers = file.readlines()

# Use the map function to convert the strings to integers

numbers = list(map(int, numbers))

# Use the sum function to calculate the sum of all the numbers

result = sum(numbers)

print(result)

