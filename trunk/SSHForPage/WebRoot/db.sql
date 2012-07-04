create user SSHFORPAGE
identified by accp2009
default tablespace temp;

grant resource,connect to SSHFORPAGE;

connect SSHFORPAGE/accp2009;

create table muser(
mid number(4) primary key,
mname varchar2(20) not null,
mpwd varchar2(16) not null,
ndate date);

create sequence muser_seq
start with 1
increment by 1
cache 10
maxvalue 1000
nocycle;

declare
begin
  for i in 1..100 loop
    insert into muser values(muser_seq.nextval,'name'||i,'pwd'||i,to_date((round(dbms_random.value(2000,2012))||'/'||round(dbms_random.value(1,12))||'/'||round(dbms_random.value(1,30))||' '||
    round(dbms_random.value(8,16))||':'||round(dbms_random.value(0,59))||':'||round(dbms_random.value(0,59))),'yyyy/mm/dd hh24:mi:ss'));
  end loop;
end;
