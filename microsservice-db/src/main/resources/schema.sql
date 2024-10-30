CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS furniture (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),                      
    name VARCHAR(255) NOT NULL,                 
    type VARCHAR(50) NOT NULL,                  
    material VARCHAR(255),                      
    color VARCHAR(50),                          
    weight DECIMAL(10, 2),                      
    price DECIMAL(10, 2),                       
    amount INTEGER,                             
    description VARCHAR(255)                    
);