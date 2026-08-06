select name as Customers
from customers
left join orders on Customers.id = Orders.customerId
where Orders.id is Null;