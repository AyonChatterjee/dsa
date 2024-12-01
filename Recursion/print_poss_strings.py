def generate_strings(set , k , curr , res):
    # base case 
    if len(curr) == k:
        res.append(curr)
        return
    
    for char in set:
        generate_strings(set , k , curr + char, res)


set = ['a' , 'b']
k = 3
res = []

generate_strings(set , k , "" , res)
print(res)