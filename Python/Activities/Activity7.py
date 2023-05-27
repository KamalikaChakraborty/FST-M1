numbers = list(input("Enter a sequence of comma separated values: ").split(","))
result = 0

for number in numbers:
    print(number)
    result = result + int(number)

print(result)
