import Ticket as t
import CashProvider  as cp

class Customer():
    def __init__(self, id: int,tickets: list, havemoney):
        self.id = id
        self.agg_tikets = tickets
        self.obj_cashProv = cp.CashProvider(havemoney)

    def search_tikets(self,rootNum =-1) -> list:
        for i in self.agg_tikets:
            if rootNum == -1:
                print(f'Customer {self.id}  {i.GetTicket()}')
            if i.GetRoot() == rootNum:
                print(f'Customer {self.id}  {i.GetTicket()}')

    def TotalPriceTicket(self) -> float:
        tp = 0
        for p in self.agg_tikets:
            tp += p.GetPrice()
        return  print(f'Total price tickets {tp}')


    def BuyTicket(self):
        tp = 0
        for p in self.agg_tikets:
            tp += p.GetPrice()

        if self.obj_cashProv.Buy(tp):
            for i in self.agg_tikets:
                i.SetValidTrue()
            print("tickets sold out")
        else:
            print("no money")


