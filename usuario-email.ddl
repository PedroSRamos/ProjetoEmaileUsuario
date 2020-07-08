
CREATE TABLE public.usuario (
                endereco VARCHAR NOT NULL,
                nome VARCHAR NOT NULL,
                data_nasc DATE NOT NULL,
                pais VARCHAR NOT NULL,
                endereco_recuperacao VARCHAR NOT NULL,
                CONSTRAINT endereco PRIMARY KEY (endereco)
);


CREATE TABLE public.email (
                id INTEGER NOT NULL,
                enderecoOrigem VARCHAR NOT NULL,
                enderecoDestino VARCHAR NOT NULL,
                assunto VARCHAR NOT NULL,
                data_envio DATE NOT NULL,
                conteudo VARCHAR NOT NULL,
                CONSTRAINT id PRIMARY KEY (id, enderecoOrigem, enderecoDestino)
);


ALTER TABLE public.email ADD CONSTRAINT usuario_email_fk
FOREIGN KEY (enderecoOrigem)
REFERENCES public.usuario (endereco)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.email ADD CONSTRAINT usuario_email_fk1
FOREIGN KEY (enderecoDestino)
REFERENCES public.usuario (endereco)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
CREATE SEQUENCE IF NOT EXISTS hibernate_sequence;