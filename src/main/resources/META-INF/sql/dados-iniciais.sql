insert into tb_medico (cpf, dt_nascimento, nome, sexo, crm, especializacao) values ("03232155544", '1997-12-10', 'Rafael','M',"23156","CLINICO_GERAL");
insert into tb_medico (cpf, dt_nascimento, nome, sexo, crm, especializacao) values ("12345678910", '1996-12-10', 'Jose Carlos','M',"21566","ORTO");
insert into tb_medico (cpf, dt_nascimento, nome, sexo, crm, especializacao) values ("02151212115", '1995-12-10', 'Ana','F',"21697","OTORRINO");

insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("21651215132", '1994-12-10', 'Leticia','F',21564);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("41111561151", '1993-12-10', 'Sara','F',32152);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("41521561561", '1992-12-10', 'João Vitor','M',21563);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("12321561564", '1991-12-10', 'Claudio','M',8743);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("23156184115", '1990-12-10', 'Flávia','F',2154);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("21561321251", '1989-12-10', 'Bruno','M',3215);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("51321561121", '1988-12-10', 'Tânia','F',5441);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("13216541251", '1987-12-10', 'Roger','M',3215);


insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-10 12:00:00',"abc","MARCADA",1,5);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-11 12:00:00',"abc","MARCADA",2,6);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-12 12:00:00',"abc","MARCADA",3,7);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-13 12:00:00',"abc","MARCADA",1,1);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-14 12:00:00',"abc","MARCADA",2,2);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-15 12:00:00',"abc","MARCADA",3,3);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-16 12:00:00',"abc","MARCADA",1,8);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-17 12:00:00',"abc","MARCADA",2,1);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-18 12:00:00',"abc","MARCADA",3,5);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-19 12:00:00',"abc","MARCADA",1,3);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-20 12:00:00',"abc","MARCADA",2,1);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-21 12:00:00',"abc","MARCADA",3,8);
