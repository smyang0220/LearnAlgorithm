def solution(ineq, eq, n, m):
    if (ineq + eq) == ">=":
        return 1 if n >= m else 0
    elif (ineq + eq) == "<=":
        return 1 if n <= m else 0
    elif (ineq + eq) == ">!":
        return 1 if n > m else 0
    elif (ineq + eq) == "<!":
        return 1 if n < m else 0