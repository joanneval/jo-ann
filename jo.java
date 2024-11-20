import random as r

arr = [r.randint(1,100) for _ in range (10)]

def next_greater_element(arr):
    n = len(arr)
    result = [-1]*n
    stack = [0]*n
    top = -1
    
    for i in range (n-1,-1,-1):
        while top != -1 and stack [top]<= arr[i]:
            top -= 1
            
        if top!= -1:
            result[i] = stack [top]
            
        top += 1
        stack[top] = arr[i]
        
    print ("Randomized generated list: ", arr)
    
    for i in range(n):
        print(f"{arr[i]} -> {result[i]}")
next_greater_element(arr)