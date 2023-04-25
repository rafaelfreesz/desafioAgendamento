insert into tb_medico (cpf, dt_nascimento, nome, sexo, crm, especializacao) values ("032.321.555-44", '1997-12-10', 'Rafael','M',"23156","CLINICO_GERAL");
insert into tb_medico (cpf, dt_nascimento, nome, sexo, crm, especializacao) values ("123.456.789-10", '1996-12-10', 'Jose Carlos','M',"21566","ORTO");
insert into tb_medico (cpf, dt_nascimento, nome, sexo, crm, especializacao) values ("021.512.121-15", '1995-12-10', 'Ana','F',"21697","OTORRINO");

insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("216.512.151-32", '1994-12-10', 'Leticia','F',21564);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("411.115.611-51", '1993-12-10', 'Sara','F',32152);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("415.215.615-61", '1992-12-10', 'João Vitor','M',21563);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("123.215.615-64", '1991-12-10', 'Claudio','M',8743);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("231.561.841-15", '1990-12-10', 'Flávia','F',2154);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("215.613.212-51", '1989-12-10', 'Bruno','M',3215);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("513.215.611-21", '1988-12-10', 'Tânia','F',5441);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("132.165.412-51", '1987-12-10', 'Roger','M',3215);


insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-05-10 12:00:00',"abc","MARCADA",1,5);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-06-11 08:30:00',"def","MARCADA",2,6);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-07-12 18:00:00',"ghi","MARCADA",3,7);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-08-13 14:00:00',"jkl","MARCADA",1,1);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-09-14 13:45:00',"mno","MARCADA",2,2);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-10-15 09:00:00',"abc","MARCADA",3,3);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-10-16 10:00:00',"def","MARCADA",1,8);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-11-17 11:00:00',"ghi","MARCADA",2,1);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-09-18 12:00:00',"jkl","MARCADA",3,5);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-08-19 12:00:00',"mno","MARCADA",1,3);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-07-20 12:00:00',"pqr","MARCADA",2,1);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-06-21 12:00:00',"stu","MARCADA",3,8);
