package aptech.fpt.spring.model;

import aptech.fpt.spring.entity.AttendanceSlots;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClassModel extends  PagingAndSortingRepository<AttendanceSlots, Integer > {

}
