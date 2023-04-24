insert into tb_medico (cpf, dt_nascimento, nome, sexo, crm, especializacao) values ("03232155544", '1997-12-10', 'Rafael','m',"23156","Clinico Geral");
insert into tb_medico (cpf, dt_nascimento, nome, sexo, crm, especializacao) values ("12345678910", '1996-12-10', 'Jose Carlos','m',"21566","Ortopedista");
insert into tb_medico (cpf, dt_nascimento, nome, sexo, crm, especializacao) values ("02151212115", '1995-12-10', 'Ana','f',"21697","Otorrinolaringologista");

insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("21651215132", '1994-12-10', 'Leticia','f',21564);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("41111561151", '1993-12-10', 'Sara','f',32152);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("41521561561", '1992-12-10', 'João Vitor','m',21563);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("12321561564", '1991-12-10', 'Claudio','m',8743);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("23156184115", '1990-12-10', 'Flávia','f',2154);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("21561321251", '1989-12-10', 'Bruno','m',3215);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("51321561121", '1988-12-10', 'Tânia','f',5441);
insert into tb_paciente (cpf, dt_nascimento, nome, sexo, prontuario) values ("13216541251", '1987-12-10', 'Roger','m',3215);


insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-10 12:00:00',"abc","Agendado",1,5);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-11 12:00:00',"abc","Agendado",2,6);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-12 12:00:00',"abc","Agendado",3,7);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-13 12:00:00',"abc","Agendado",1,1);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-14 12:00:00',"abc","Agendado",2,2);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-15 12:00:00',"abc","Agendado",3,3);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-16 12:00:00',"abc","Agendado",1,8);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-17 12:00:00',"abc","Agendado",2,1);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-18 12:00:00',"abc","Agendado",3,5);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-19 12:00:00',"abc","Agendado",1,3);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-20 12:00:00',"abc","Agendado",2,1);
insert into tb_consulta (dt_hora_agendamento, descricao, status, fk_medico,fk_paciente) values ('2023-12-21 12:00:00',"abc","Agendado",3,8);
