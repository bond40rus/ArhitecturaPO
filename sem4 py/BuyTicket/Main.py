import Ticket
import Customer

t1 = Ticket.Ticket(1, 200, 3)
t2 = Ticket.Ticket(2, 300)

ticket_list = [t1, t2]

cm = Customer.Customer(1, ticket_list, 400)  # 3 третий парметр типа банк покупателя / карты с суммой

cm.search_tikets()
cm.TotalPriceTicket()
cm.BuyTicket()
cm.search_tikets()
