from datetime import datetime


class Ticket():
    def __init__(self, rootNumber: int, price: float, place: int = 0):
        self._rootNumber = rootNumber
        self.price = price
        self.place = place
        self.date = date = datetime.today().strftime("%Y.%m.%d")
        self._isValid = False

    def GetRoot(self):
        return self._rootNumber

    def GetTicket(self):
        return [
            f'Ticket №"{self._rootNumber} |Price = {self.price} |Date {self.date} {"|Not Place" if self.place == 0 else "|Place " + str(self.place)} |Status {self._isValid}']

    def SetValidTrue(self):
        self._isValid = True
        return self._isValid

    def GetValid(self):
        return self._isValid

    def GetPrice(self):
        return self.price

###########
