def recursive_function(n):
    if(n <= 1):
        return n
    else:
        return recursive_function(n - 2) + recursive_function(n - 1)
    
n = 5

for i in range(n):
    print(recursive_function(i))

print(f"Sum of the fibonacci series is : {recursive_function(n)}")    