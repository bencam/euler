def multiples_of_3_and_5(num):
    lst = list(range(1, num))
    answer = 0
    for x in lst:
        if x % 3 == 0 or x % 5 == 0:
            answer += x
    return answer

