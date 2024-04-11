/* Orden alfabetico */
SELECT * FROM personajes
ORDER BY nombre;
/* Pertenecientes a elfos*/
SELECT p.* 
FROM personajes p
INNER JOIN razas r ON p.id_raza = r.idRaza
WHERE r.nombre = 'Elfos'
ORDER BY p.nombre;

/* Listar regiones de la tierra media*/
SELECT nombre
FROM lugares;