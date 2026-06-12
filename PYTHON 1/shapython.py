lst=(10,10,2,3,4,5,6,7,10,10)
x=10
count=0
for ele in lst:
    if(ele==x):
        count=count+1
print("{}has occured{}times".format(x,count))     
