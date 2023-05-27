def calculate_sum(numbers):
    sumValue = 0
    for number in numbers:
        sumValue += number
    return sumValue


numList = [10, 40, 60, 90]
result = calculate_sum(numList)
print("The sum of all the elements is: " + str(result))
