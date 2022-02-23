import pytest

def test_sum(input_value):
    num1=12
    num2=45
    sum=num1+num2
    assert sum==25
def test_difference(): 
    num1=45
    num2=55
    diff=num2-num1
    assert diff==0
    	
@pytest.mark.activity
def test_multiply():
    num1=14
    num2=7
    product=num1*num2
    assert product!=0
	
@pytest.mark.activity
def test_divide():
    num1=14
    num2=15
    quotient=num1/num2
    assert quotient!=0
    