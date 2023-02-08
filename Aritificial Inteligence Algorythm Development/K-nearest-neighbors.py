# Books [didact, poetry, fiction, self-development, economy]

# Readability (0-5)
# Dificulty (0-5)
# Has formulas (0-5)
# Contain rythm (0-5)
# Is utopic (0-5)

book1=[0,5,5,0,0]
book2=[0,5,0,0,0]
book3=[5,5,0,0,0]
book4=[0,0,5,5,0]
isDidatic=[0,1,1,0]

x=[book1, book2, book3, book4]

y=isDidatic

neigh=KNeighborsClassifier(n_neighbors=3)

neigh.fit(x,y)

newBook=[[0,2,4,0,0]]
result=neigh.predict(newBook)

if result==0 :
    print('Is didatic')
else: 
    print('Is not didatic')