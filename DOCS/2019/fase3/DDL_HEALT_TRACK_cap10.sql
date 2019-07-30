-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- pgModeler  version: 0.9.1
-- PostgreSQL version: 10.0
-- Project Site: pgmodeler.io
-- Model Author: ---


-- Database creation must be done outside a multicommand file.
-- These commands were put in this file only as a convenience.
-- -- object: "PERFIL" | type: DATABASE --
-- -- DROP DATABASE IF EXISTS "PERFIL";
-- CREATE DATABASE "PERFIL";
-- -- ddl-end --
-- 

-- object: public."USUARIO" | type: TABLE --
-- DROP TABLE IF EXISTS public."USUARIO" CASCADE;
CREATE TABLE public."USUARIO"(
	"ID_USUARIO" smallint NOT NULL,
	"NOME" text,
	"SOBRENOME" text,
	"DATA_NASCIMENTO" date,
	CONSTRAINT "USUARIO_pk" PRIMARY KEY ("ID_USUARIO")

);
-- ddl-end --
ALTER TABLE public."USUARIO" OWNER TO postgres;
-- ddl-end --

-- object: public."LOGIN" | type: TABLE --
-- DROP TABLE IF EXISTS public."LOGIN" CASCADE;
CREATE TABLE public."LOGIN"(
	"ID_LOGIN" smallint NOT NULL,
	"USER" text,
	"SENHA" text,
	"ULTIMO_ACESSO" date,
	"STATUS" boolean,
	"ID_USUARIO_USUARIO" smallint NOT NULL,
	CONSTRAINT "LOGIN_pk" PRIMARY KEY ("ID_LOGIN")

);
-- ddl-end --
ALTER TABLE public."LOGIN" OWNER TO postgres;
-- ddl-end --

-- object: public."PERFIL" | type: TABLE --
-- DROP TABLE IF EXISTS public."PERFIL" CASCADE;
CREATE TABLE public."PERFIL"(
	"ID_PERFIL" smallint NOT NULL,
	"NOME" text,
	"DESCRICAO" text,
	"ID_LOGIN_LOGIN" smallint NOT NULL,
	CONSTRAINT "PERFIL_pk" PRIMARY KEY ("ID_PERFIL")

);
-- ddl-end --
ALTER TABLE public."PERFIL" OWNER TO postgres;
-- ddl-end --

-- object: public."MENU" | type: TABLE --
-- DROP TABLE IF EXISTS public."MENU" CASCADE;
CREATE TABLE public."MENU"(
	"ID_MENU" smallint NOT NULL,
	"LABEL" text,
	"URL" text,
	"DESCRICAO" smallint,
	"ID_PERFIL_PERFIL" smallint NOT NULL,
	CONSTRAINT "MENU_pk" PRIMARY KEY ("ID_MENU")

);
-- ddl-end --
ALTER TABLE public."MENU" OWNER TO postgres;
-- ddl-end --

-- object: public."EXERCICIO" | type: TABLE --
-- DROP TABLE IF EXISTS public."EXERCICIO" CASCADE;
CREATE TABLE public."EXERCICIO"(
	"ID_EXERCICIO" smallint NOT NULL,
	"NOME" text,
	"DESCRICAO_EXPLICATIVA" smallint,
	CONSTRAINT "EXERCICIO_pk" PRIMARY KEY ("ID_EXERCICIO")

);
-- ddl-end --
ALTER TABLE public."EXERCICIO" OWNER TO postgres;
-- ddl-end --

-- object: public."TREINO" | type: TABLE --
-- DROP TABLE IF EXISTS public."TREINO" CASCADE;
CREATE TABLE public."TREINO"(
	"ID_TREINO" smallint NOT NULL,
	"DIA_SEMANA" smallint,
	"NOME" text,
	"ID_EXERCICIO_EXERCICIO" smallint NOT NULL,
	CONSTRAINT "TREINO_pk" PRIMARY KEY ("ID_TREINO")

);
-- ddl-end --
ALTER TABLE public."TREINO" OWNER TO postgres;
-- ddl-end --

-- object: public."INGREDIENTE" | type: TABLE --
-- DROP TABLE IF EXISTS public."INGREDIENTE" CASCADE;
CREATE TABLE public."INGREDIENTE"(
	"ID_INGREDIENTE" smallint NOT NULL,
	"NOME" text,
	"ID_REFEICAO_REFEICAO_SUGESTAO" smallint NOT NULL,
	CONSTRAINT "INGREDIENTE_pk" PRIMARY KEY ("ID_INGREDIENTE")

);
-- ddl-end --
ALTER TABLE public."INGREDIENTE" OWNER TO postgres;
-- ddl-end --

-- object: public."RE

-- SQL code purposely truncated at this point in demo version!