package pe.edu.upc.venta.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.venta.entities.Venta;
import pe.edu.upc.venta.repositories.DetalleVentaRepository;
import pe.edu.upc.venta.repositories.VentaRepository;
import pe.edu.upc.venta.services.VentaService;

import java.util.List;
import java.util.Optional;

@Service
public class VentaServiceImpl implements VentaService {
    @Autowired
    private VentaRepository ventaRepository;
    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    @Override
    public Venta save(Venta entity) throws Exception {
        return ventaRepository.save(entity);
    }

    @Override
    public List<Venta> findAll() throws Exception {
        return ventaRepository.findAll();
    }

    @Override
    public Optional<Venta> findById(Long aLong) throws Exception {
        return ventaRepository.findById(aLong);
    }

    @Override
    public Venta update(Venta entity) throws Exception {
        return ventaRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        ventaRepository.deleteById(aLong);
    }
}