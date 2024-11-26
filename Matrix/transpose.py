N = 4 


def transpose(A , B):
  

    for i in range(N):
        for j in range(N):
           B[i][j] = A[j][i]



# driver code 
A = [ [1, 1, 1, 1], 
 [2, 2, 2, 2], 
 [3, 3, 3, 3], 
 [4, 4, 4, 4]] 
 
B = A[:][:]

transpose(A , B)

for i  in range(N):
    for j in range(N):
        print(B[i][j] , " ", end = '')
    print()
        


          