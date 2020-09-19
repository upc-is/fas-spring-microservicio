package pe.edu.upc.producto.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.producto.entities.Producto;
import pe.edu.upc.producto.repositories.ProductoRepository;
import pe.edu.upc.producto.services.ProductoService;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto save(Producto entity) throws Exception {
        return productoRepository.save(entity);
    }

    @Override
    public List<Producto> findAll() throws Exception {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> findById(Long aLong) throws Exception {
        return productoRepository.findById(aLong);
    }

    @Override
    public Producto update(Producto entity) throws Exception {
        return productoRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        productoRepository.deleteById(aLong);
    }
}
