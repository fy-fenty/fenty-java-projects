create user QuartzVote
identified by accp2009
default tablespace test_tbsp;

grant resource,connect to QuartzVote;

create table muser(
mid number(4) primary key,
mname varchar2(12),
mpwd varchar2(16)
);

create table vote(
vid number(4) primary key,
vtitle varchar2(50),
vcontent varchar2(200)
);

create table vote_option(
void number(4) primary key,
vid number(4) references vote(vid),
vocontext varchar2(100)
);

create table vote_detail(
vdid number(4) primary key,
mid number(4) references muser(mid),
vid number(4) references vote(vid),
vdcontext varchar2(10)
);

declare  
  type muser_table_type is table of varchar2(20)
    index by binary_integer;
  muser_table muser_table_type;  
  type opt_table_type is table of varchar2(10)
    index by binary_integer;
  opt_table opt_table_type;
  mucount number;
  muid number;
  mop number;
  coun number :=1;
begin
  muser_table(1):='Africa';
  muser_table(2):='Argentina';
  muser_table(3):='Australia';
  muser_table(4):='Austria';
  muser_table(5):='Belgium';
  muser_table(6):='Brazil';
  muser_table(7):='Bulgaria';
  muser_table(8):='Canada';
  muser_table(9):='Caribbean';
  muser_table(10):='Central America';
  muser_table(11):='Chile';
  muser_table(12):='China';
  muser_table(13):='Colombia';
  muser_table(14):='Costa Rica';
  muser_table(15):='Croatia';
  muser_table(16):='Czech Republic';
  muser_table(17):='Denmark';
  muser_table(18):='Dominican Republic';
  muser_table(19):='Estonia';
  muser_table(20):='Finland';
  muser_table(21):='France';
  muser_table(22):='Germany';
  muser_table(23):='Greece';
  for i in 1..muser_table.count loop  
    insert into muser values (i,muser_table(i),muser_table(i));  
  end loop;
  commit;
  for i in 1..100 loop
    insert into vote values(i,'标题'||i,'投票内容'||i);
  end loop;
  commit;
  for i in 1..100 loop
    for j in 1..4 loop
      insert into vote_option values(coun,i,'选项内容'||j);
      coun:=coun+1;
    end loop;
  end loop;
  commit;
  opt_table(1):='A';
  opt_table(2):='B';
  opt_table(3):='C';
  opt_table(4):='D';
  select count(mid) into mucount from muser;
  for i in 1..100 loop
    select round(dbms_random.value(1,mucount)) into muid from dual;
    select round(dbms_random.value(1,4)) into mop from dual;
    insert into vote_detail values(i,muid,i,opt_table(mop));
  end loop;
end;

commit;
