def solution(arr):
    answer = []
    tmp = 10
    for num in arr:
        if tmp != num:
            tmp = num
            answer.append(num)
    return answer