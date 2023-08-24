class CashProvider:
    def __init__(self, havemoney: int = 0):
        self.haveMoney = havemoney
        self.isAutorization = isAutorization = False

    def AutoRiz(self):
        return True

    def Buy(self, price: int) -> bool:
        if self.haveMoney >= price:
            return True
