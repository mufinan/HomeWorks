--film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
select count(*) from film where length > (select AVG(length) from film);


--film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
select count(*) from film where rental_rate = (select rental_rate from film order by rental_rate desc limit 1);


--film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
select * from film where rental_rate = (select rental_rate from film order by rental_rate asc limit 1) and replacement_cost = (select replacement_cost from film order by replacement_cost asc limit 1);


--payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
select customer.customer_id, customer.first_name, customer.last_name,
       (select count(*) from payment WHERE payment.customer_id = customer.customer_id) AS payment_count
from customer order by payment_count desc;