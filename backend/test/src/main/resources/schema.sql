CREATE TABLE test_case_execution (
    test_case_id INT AUTO_INCREMENT PRIMARY KEY ,
    status VARCHAR(20),
    module VARCHAR(50),
    executed_by VARCHAR(50),
    execution_date DATE
);



CREATE TABLE defects (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    module_name VARCHAR(100),
    defect_status VARCHAR(50), -- e.g., 'Open', 'Closed', 'In Progress'
    created_date DATE
);
