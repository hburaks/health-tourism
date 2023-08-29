package com.allianz.healthtourism.model.requestDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import com.allianz.healthtourism.util.security.UserEntity;
import lombok.Data;

import java.util.List;

@Data
public class PatientRequestDTO extends BaseRequestDTO {
    private UserEntity user;
    private List<ExaminationRecordRequestDTO> examinationRecords;
    private List<BookingRequestDTO> bookings;
    private List<AppointmentRequestDTO> appointments;
    private List<PlaneTicketRequestDTO> planeTickets;
}