import sqlite3
conn=sqlite3.connect('c:\\sqlite\\tcs.db')
for row in conn.execute("select *from google"):
    #print(row[0],row[1],row[2])
    print(row)
