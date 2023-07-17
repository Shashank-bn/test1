def count_multiples(numbers):
    multiples = {1: 0, 2: 0, 3: 0, 4: 0, 5: 0, 6: 0, 7: 0, 8: 0, 9: 0}
    for num in numbers:
        for multiple in multiples:
            if num % multiple == 0:
                multiples[multiple] += 1
    return multiples

numbers = [1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30]
result = count_multiples(numbers)
print(result)
