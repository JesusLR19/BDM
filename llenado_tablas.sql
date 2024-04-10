INSERT INTO razas (nombre, descripcion) VALUES
-- Hobbits
('Hobbits', 'Un pueblo pequeño y pacífico que vive en la Comarca.'),
-- Elfos
('Elfos', 'Un pueblo noble y majestuoso que vive en los bosques y valles de la Tierra Media.'),
-- Enanos
('Enanos', 'Un pueblo fuerte y resistente que vive en las montañas.'),
-- Hombres
('Hombres', 'Un pueblo diverso que habita en diferentes regiones de la Tierra Media.'),
-- Maiar
('Maiar', 'Unos seres angelicales que sirven a los Valar.'),
-- Dúnedain
('Dúnedain', 'Un pueblo noble de hombres que habitan en Gondor y Arnor.'),
-- Criaturas de las Cavernas
('Criaturas de las Cavernas', 'Unas criaturas corruptas que habitan en las Montañas Nubladas.'),
-- Istari
('Istari', 'Unos magos poderosos enviados a la Tierra Media para combatir a Sauron.'),
-- Señor Oscuro
('Señor Oscuro', 'Un ser malvado que busca dominar la Tierra Media.');

INSERT INTO personajes (nombre, lugarOrigen, descripcion, id_raza) VALUES
-- Frodo Bolsón
('Frodo Bolsón', 'La Comarca', 'Un hobbit bondadoso y valiente que emprende la misión de destruir el Anillo Único.', 1),
-- Gandalf
('Gandalf', 'Valinor', 'Un mago sabio y poderoso que guía a la Comunidad del Anillo.', 5),
-- Aragorn
('Aragorn', 'Gondor', 'Un noble guerrero que está destinado a convertirse en rey de Gondor.', 6),
-- Legolas
('Legolas', 'Bosque Negro', 'Un arquero elfo habilidoso y valiente.', 2),
-- Gimli
('Gimli', 'Montañas Nubladas', 'Un enano fuerte y leal.', 3),
-- Samwise Gamyi
('Samwise Gamyi', 'La Comarca', 'El leal jardinero y amigo de Frodo.', 1),
-- Boromir
('Boromir', 'Gondor', 'Un guerrero valiente y honorable que busca salvar a su ciudad natal.', 4),
-- Merry Brandybuck
('Merry Brandybuck', 'La Comarca', 'Un hobbit alegre y aventurero.', 1),
-- Pippin Tuk
('Pippin Tuk', 'La Comarca', 'Un hobbit travieso y bromista.', 1),
-- Gollum
('Gollum', 'Montañas Nubladas', 'Una criatura corrupta y obsesionada con el Anillo Único.', 8),
-- Saruman
('Saruman', 'Valinor', 'Un mago poderoso que se ha corrompido por el deseo de poder.', 7),
-- Sauron
('Sauron', 'Mordor', 'Un ser malvado que busca dominar la Tierra Media.', 9);

INSERT INTO lugares (nombre, descripcion, region) VALUES
-- La Comarca
('La Comarca', 'Un pacífico condado habitado por hobbits.', 'Eriador'),
-- Rivendel
('Rivendel', 'Un valle élfico donde se reúne la Comunidad del Anillo.', 'Eriador'),
-- Minas Tirith
('Minas Tirith', 'La capital de Gondor.', 'Gondor'),
-- Mordor
('Mordor', 'La tierra oscura donde reside Sauron.', 'Mordor'),
-- Monte del Destino
('Monte del Destino', 'Un volcán en Mordor donde se debe destruir el Anillo Único.', 'Mordor'),
-- Abismo de Helm
('Abismo de Helm', 'Una fortaleza de Rohan donde se defiende el reino contra las fuerzas de Saruman.', 'Rohan');

INSERT INTO eventos (nombre, descripcion, fecha, idLugar) VALUES
-- El Concilio de Elrond
('El Concilio de Elrond', 'Reunión en Rivendel para decidir el destino del Anillo Único.', '25-10-3018 T.E.', 2),
-- La partida de la Comunidad del Anillo
('La partida de la Comunidad del Anillo', 'La Comunidad del Anillo emprende su viaje hacia Mordor.', '25-12-3018 T.E.', 2),
-- La Batalla de Amon Hen
('La Batalla de Amon Hen', 'La Comunidad del Anillo se desintegra tras el ataque de los Uruk-hai.', '29-02-3019 T.E.', 2),
-- La Batalla del Abismo de Helm
('La Batalla del Abismo de Helm', 'Los Rohirrim resisten el ataque de las fuerzas de Saruman.', '03-03-3019 T.E.', 6),
-- La destrucción del Anillo Único
('La destrucción del Anillo Único', 'Frodo destruye el Anillo Único en el Monte del Destino.', '25-03-3019 T.E.', 5),
-- La coronación de Aragorn
('La coronación de Aragorn', 'Aragorn es coronado rey de Gondor.', '01-05-3019 T.E.', 3),
-- La derrota de Saruman
('La derrota de Saruman', 'Gandalf y los Ents derrotan a Saruman en Orthanc.', '05-07-3019 T.E.', 4),
-- La Batalla de los Campos de Pelennor
('La Batalla de los Campos de Pelennor', 'Las fuerzas de Gondor y Rohan se enfrentan al ejército de Sauron.', '10-03-3019 T.E.', 3),
-- La Batalla de la Puerta Negra
('La Batalla de la Puerta Negra', 'Las fuerzas de la Tierra Media se enfrentan al ejército de Sauron ante las Puertas Negras de Mordor.', '25-03-3019 T.E.', 4),
-- La caída de Sauron
('La caída de Sauron', 'Sauron es derrotado tras la destrucción del Anillo Único.', '25-03-3019 T.E.', 4);

