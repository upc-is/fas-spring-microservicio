package pe.edu.upc.venta.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.venta.entities.Producto;
import pe.edu.upc.venta.repositories.ProductoRepository;
import pe.edu.upc.venta.services.ProductoService;

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
