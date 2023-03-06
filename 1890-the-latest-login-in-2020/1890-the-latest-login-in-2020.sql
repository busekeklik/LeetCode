Select user_id, Max(time_stamp) As last_stamp 
From Logins 
Where year(time_stamp) = 2020
Group By user_id;