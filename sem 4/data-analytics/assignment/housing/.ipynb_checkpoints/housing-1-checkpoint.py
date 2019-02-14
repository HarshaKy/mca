#!/usr/bin/env python
# coding: utf-8

# In[9]:


import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
    
from sklearn import linear_model
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression


# In[10]:


df = pd.read_csv('Housing.csv', index_col = [0])


# In[11]:


df.head()


# In[12]:


df = df [['price', 'lotsize', 'bedrooms', 'stories', 'garagepl']]
x = df[['lotsize']]
y = df[['price']]


# In[13]:


xtrain, xtest,  ytrain, ytest = train_test_split(x, y,  test_size =  0.4, random_state = 0)


# In[14]:


regressor =  LinearRegression()
regressor.fit(xtrain, ytrain)


# In[15]:


yPred = regressor.predict(xtest)
yPred[:10]


# In[ ]:




