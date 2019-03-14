#!/usr/bin/env python
# coding: utf-8

# In[1]:


import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

from sklearn import linear_model
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression


# In[2]:


df = pd.read_csv('Housing.csv', index_col = [0])


# In[3]:


df.head()


# In[4]:


df = df[['price', 'lotsize']]
x = df[['lotsize']]
y = df[['price']]


# In[5]:


xtrain, xtest, ytrain, ytest = train_test_split(x, y, test_size = 0.4, random_state = 0)


# In[6]:


regressor = LinearRegression()
regressor.fit(xtrain, ytrain)


# In[7]:


ypred = regressor.predict(xtest)
ypred[:10]


# In[9]:


plt.figure(figsize = (20, 10))
plt.scatter(xtrain, ytrain, color = 'blue')
plt.plot(xtrain, regressor.predict(xtrain), color = 'black', linewidth = 3)
plt.title('Housing.csv Training')
plt.xlabel('Lotsize')
plt.ylabel('Price')
plt.show()


# In[10]:


plt.figure(figsize = (20, 10))
plt.scatter(xtest, ytest, color = 'blue')
plt.plot(xtest, regressor.predict(xtest), color = 'black', linewidth = 3)
plt.title('Housing.csv Testing')
plt.xlabel('Lotsize')
plt.ylabel('Price')
plt.show()


# In[ ]:




