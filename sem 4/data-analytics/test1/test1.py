#!/usr/bin/env python
# coding: utf-8

# In[1]:


# Import Libraries
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

from sklearn import linear_model
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression


# In[5]:


# Read CSV
df = pd.read_csv('cars.csv')


# In[6]:


df.head()


# In[7]:


df = df[['wt', 'hp']]
x = df[['wt']]
y = df[['hp']]


# In[15]:


xtrain, xtest, ytrain, ytest = train_test_split(x, y, test_size = 0.3, random_state = 0)


# In[16]:


# Develop Linear Regression Model
regressor = LinearRegression()
regressor.fit(xtrain, ytrain)


# In[29]:


# Apply for test data
ypred = regressor.predict(xtest)
ypred[:10]


# In[26]:


# Scatter Plot
plt.figure(figsize = (20, 10))
plt.scatter(xtrain, ytrain, color = 'blue')
plt.plot(xtrain, regressor.predict(xtrain), color = 'black', linewidth = 3)
plt.title('cars.csv Training')
plt.xlabel('weight')
plt.ylabel('horsepower')
plt.show()


# In[27]:


plt.figure(figsize = (20, 10))
plt.scatter(xtest, ytest, color = 'blue')
plt.plot(xtest, regressor.predict(xtest), color = 'black', linewidth = 3)
plt.title('cars.csv Testing')
plt.xlabel('weight')
plt.ylabel('horsepower')
plt.show()


# In[ ]:




