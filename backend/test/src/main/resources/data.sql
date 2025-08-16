INSERT INTO test_case_execution ( status, module, executed_by, execution_date)
VALUES
('Passed', 'Login', 'John', '2025-08-01'),
('Failed', 'Login', 'John', '2025-08-01'),
( 'Not Executed', 'Payment', NULL, NULL),
('Passed', 'Cart', 'Alice', '2025-08-03'),
('Failed', 'Cart', 'Alice', '2025-08-03'),
('Passed', 'Cart', 'John', '2025-08-03');



INSERT INTO defects (module_name, defect_status, created_date) VALUES
('Login', 'Open', '2025-08-01'),
('Login', 'Closed', '2025-08-02'),
('Login', 'In Progress', '2025-08-03'),
('Checkout', 'Open', '2025-08-05'),
('Checkout', 'Closed', '2025-08-06'),
('Checkout', 'Closed', '2025-08-07'),
('Profile', 'Open', '2025-08-01'),
('Profile', 'Open', '2025-08-02'),
('Profile', 'Closed', '2025-08-04');
