import numpy as np

A = [[1 , 2 , 3],
     [4, 5 , 6],
     [7 , 8 , 9]]

B = [[3 , 4 , 5],
     [6 , 2 , 3] , 
     [7 , 8 ,9]]

C = np.array(A) + np.array(B)

print(C)


# Output : 
# [[ 4  6  8]
# [10  7  9]
# [14 16 18]]