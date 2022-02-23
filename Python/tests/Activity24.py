import pytest
@pytest.fixture
def wallet():
    amount=0
    return amount
@pytest.mark.parametrize("earned,spent,expected",[(30,10,20),(20,2,18)])
def test_expenditure(wallet,earned,spent,expected):
    assert wallet==0
    wallet=wallet+earned
    wallet=wallet-spent
    assert expected==wallet




