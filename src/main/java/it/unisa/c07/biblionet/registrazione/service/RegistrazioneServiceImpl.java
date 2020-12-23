package it.unisa.c07.biblionet.registrazione.service;

import it.unisa.c07.biblionet.model.dao.utente.BibliotecaDAO;
import it.unisa.c07.biblionet.model.entity.utente.Biblioteca;
import it.unisa.c07.biblionet.model.entity.utente.Lettore;
import it.unisa.c07.biblionet.model.entity.utente.UtenteRegistrato;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class RegistrazioneServiceImpl implements RegistrazioneService{

    BibliotecaDAO bibliotecaDAO;

    @Override
    public UtenteRegistrato registraLettore(Lettore lettore) {
        return null;
    }

    @Override
    public UtenteRegistrato registraBiblioteca(Biblioteca biblioteca) {
        return bibliotecaDAO.save(biblioteca);
    }
}
