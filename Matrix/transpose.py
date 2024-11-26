N = 4 
M = 3


def transpose(A , B):
  

    for i in range(N):
        for j in range(M):
           B[i][j] = A[j][i]



# driver code 
A = [ [1, 1, 1, 1], 
 [2, 2, 2, 2], 
 [3, 3, 3, 3]] 
 
B = [[0 for x in range(M)] for y in range(N)]  # Initialising the "B" with "0"

transpose(A , B)

for i  in range(N):
    for j in range(M):
        print(B[i][j] , " ", end = '')
    print()
        


          