/* 
 * COMENTARIOS
 */
create or replace function total()
returns integer as $totals
declare
total integer;
begin
select count(*) into total from company;
return total;
$total$ language plpgsql;
