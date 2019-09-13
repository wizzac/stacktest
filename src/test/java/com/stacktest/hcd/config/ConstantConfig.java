package com.stacktest.hcd.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface ConstantConfig {

	public static final String APP_VERSION = "1.5.0";

	public static final String ENV_DEV = "dev";
	public static final String ENV_TEST = "test";
	public static final String ENV_PROD = "prod";

	// WS CONFIG
	public static final String WS_SUFFIX_MAIN = "_MAIN";
	public static final String WS_SUFFIX_HEALTH_CENTER = "_HEALTH_CENTER";
	public static final String WS_SUFFIX_OPERATOR = "_OPERATOR";
	public static final String WS_SUFFIX_EXCLUDE_OPERATOR = "_EXCLUDE_OPERATOR";
	public static final String WS_SUFFIX_URL = "_URL";

	public static final String WS_NEW_SCHEDULE = "WS_NEW_SCHEDULE"; // prender ws.
	public static final String WS_HOSPITAL_ITALIANO = "WS_HOSPITAL_ITALIANO"; // prender ws.
	public static final String WS_HOSPITAL_ITALIANO_URL = "WS_HOSPITAL_ITALIANO_URL";

	public static final String WS_HOSPITAL_ITALIANO_SUB_SET_ID = "WS_HOSPITAL_ITALIANO_SUB_SET_ID";
	public static final String WS_HOSPITAL_ITALIANO_SUB_SET_ID_INSTITUCION = "WS_HOSPITAL_ITALIANO_SUB_SET_ID_INSTITUCION";
	public static final String WS_HOSPITAL_ITALIANO_SUB_SET_PROBLEMAS = "WS_HOSPITAL_ITALIANO_SUB_SET_PROBLEMAS";
	public static final String WS_HOSPITAL_ITALIANO_SUB_SET_PROCEDIMIENTOS = "WS_HOSPITAL_ITALIANO_SUB_SET_PROCEDIMIENTOS";
	public static final String WS_HOSPITAL_ITALIANO_SUB_SET_PROCEDIMIENTOS_GRAL = "WS_HOSPITAL_ITALIANO_SUB_SET_PROCEDIMIENTOS_GRAL";
	public static final String WS_HOSPITAL_ITALIANO_SUB_SET_PROCEDIMIENTOS_GRAL_ON = "WS_HOSPITAL_ITALIANO_SUB_SET_PROCEDIMIENTOS_GRAL_ON";

	public static final String WS_HOSPITAL_ITALIANO_SUB_SET_MEDICINE_GENERIC = "WS_HOSPITAL_ITALIANO_SUB_SET_MEDICINE_VMP";
	public static final String WS_HOSPITAL_ITALIANO_SUB_SET_MEDICINE_COMMERCIAL = "WS_HOSPITAL_ITALIANO_SUB_SET_MEDICINE_AMP";

	public static final String WS_HOSPITAL_ITALIANO_DIAGNOSIS = "WS_HOSPITAL_ITALIANO_DIAGNOSIS";
	public static final String WS_HOSPITAL_ITALIANO_COMPLEMENTARY_STUDIES = "WS_HOSPITAL_ITALIANO_STUDIES";
	public static final String WS_HOSPITAL_ITALIANO_MEDICINES = "WS_HOSPITAL_ITALIANO_MEDICINES";

	// Estados del resultado de items del WS Italiano.
	public static final String WS_TERM_VALID = "TERM_VALID";
	public static final String WS_TERM_NOT_VALID = "TERM_NOT_VALID";
	public static final String WS_TERM_REFINE = "TERM_REFINE";
	public static final String WS_TERM_UNRECOGNIZED = "TERM_UNRECOGNIZED";

	// INTEGRACION GENERAL ELECTRIC
	public static final String WS_GENERAL_ELECTRIC = "WS_GENERAL_ELECTRIC"; // prender ws.
	public static final String WS_GENERAL_ELECTRIC_URL = "WS_GENERAL_ELECTRIC_URL";
	public static final String WS_GENERAL_ELECTRIC_LOGGER = "generalElectricLogger";

	public static final String WS_GE_ACK_CODE_SUCCESS = "AA";
	public static final String WS_GE_ACK_CODE_ERROR = "AE";
	public static final String WS_GE_FLOW_IN = "IN";
	public static final String WS_GE_FLOW_OUT = "OUT";
	public static final String WS_GE_ENDPOINT_ORDER_REQUEST = "ORDER_REQUEST";
	public static final String WS_GE_ENDPOINT_ORDER_RESPONSE = "ORDER_RESPONSE";
	public static final String WS_GE_ENDPOINT_ORDER_REPORT = "ORDER_REPORT";
	public static final String WS_GE_ENDPOINT_ACK = "ACK";

	public static final String WS_GENERAL_ELECTRIC_RECEIVING_APPLICATION = "WS_GENERAL_ELECTRIC_RECEIVING_APPLICATION";
	public static final String WS_GENERAL_ELECTRIC_RECEIVING_FACILITY = "WS_GENERAL_ELECTRIC_RECEIVING_FACILITY";
	public static final String WS_GENERAL_ELECTRIC_SENDING_APPLICATION = "WS_GENERAL_ELECTRIC_SENDING_APPLICATION";
	public static final String WS_GENERAL_ELECTRIC_SENDING_FACILITY = "WS_GENERAL_ELECTRIC_SENDING_FACILITY";

	/** Crea una nueva solicitud de pedido */
	public static final String WS_GE_ORDER_REQUEST_OPERATION_NW = "NW";
	/** Actualiza un pedido siempre desde que su estado sea Solicitado */
	public static final String WS_GE_ORDER_REQUEST_OPERATION_XO = "XO";
	/**
	 * Programado o Registrado. CA - Cancela un pedido desde que su estado sea
	 * Solicitado, Programado o Registrado
	 */
	public static final String WS_GE_ORDER_REQUEST_OPERATION_CA = "CA";

	/** SC para cambio de estado */
	public static final String WS_GE_ORDER_RESPONSE_OPERATION_CS = "SC";
	/** OC para estudio borrado */
	public static final String WS_GE_ORDER_RESPONSE_OPERATION_OC = "OC";

	public static final String WS_GE_ORDER_PENDIENTE = "p";
	public static final String WS_GE_ORDER_CITADO = "t";
	public static final String WS_GE_ORDER_ADMITIDO = "a";
	public static final String WS_GE_ORDER_FINALIZADO = "u";
	public static final String WS_GE_ORDER_BORRADO = "g";
	public static final String WS_GE_ORDER_ESPERANDO = "w";
	public static final String WS_GE_ORDER_COMENZANDO = "b";
	public static final String WS_GE_ORDER_ESCRITO = "s";
	public static final String WS_GE_ORDER_DICTADO = "d";
	public static final String WS_GE_ORDER_INFORMADO = "f";

	public static final String WS_GE_REPORT_FIN = "u";
	public static final String WS_GE_REPORT_FINALIZADO = "f";
	public static final String WS_GE_REPORT_BORRADO = "g";

	public static final String WS_GE_VISIT_ADMISSION_TYPE = "S";

	public static final List<String> VALID_ENV_LIST = Arrays.asList(ENV_DEV, ENV_TEST, ENV_PROD);

	public static final String PUCO_WS_ENABLED = "1";
	public static final String CIPE_WS_ENABLED = "1";
	public static final String LOGIN_CIPE = "LOGIN_CIPE";

	public static final String PATH_FILE = "pathFile";

	public static final String CONSULTATION_STATUS_ACT = "ACT";
	public static final String CONSULTATION_STATUS_BAJ = "BAJ";
	public static final String CONSULTATION_STATUS_FIN = "FIN";
	public static final String CONSULTATION_STATUS_CAN = "CAN";

	public static final String SCHEDULE_STATUS_ACT = "ACT";
	public static final String SCHEDULE_STATUS_CON = "CON";
	public static final String SCHEDULE_STATUS_FIN = "FIN";
	public static final String SCHEDULE_STATUS_CAN = "CAN";
	public static final String SCHEDULE_STATUS_BAJ = "BAJ";
	public static final String SCHEDULE_STATUS_CALLED = "CALLED";
	public static final String SCHEDULE_STATUS_CANCEL_BY_PLANNING = "CANCEL_PLANNING";

	public static final String ONCOLOGY_STATUS_ACT = "ACT";
	public static final String ONCOLOGY_STATUS_BAJ = "BAJ";
	public static final String ONCOLOGY_STATUS_FIN = "FIN";
	public static final String ONCOLOGY_STATUS_PENDING_FIN = "PEN";

	public static final String SCHEDULE_TYPE_PRO = "PRO";
	public static final String SCHEDULE_TYPE_DEM = "DEM";
	public static final String SCHEDULE_TYPE_INT = "INT";

	public static final String SERVICES_STATUS_ACT = "ACT";
	public static final String SERVICES_STATUS_BAJ = "BAJ";

	public static final String SERVICES_TYPE_DEM = "DEM";

	public static final String HEALTH_CENTER_STATUS_ACT = "ACT";
	public static final String HEALTH_CENTER_STATUS_BAJ = "BAJ";

	public static final String VADEMECUM_STATUS_ACT = "ACT";
	public static final String VADEMECUM_STATUS_BAJ = "BAJ";

	public static final String SPECIALTY_STATUS_ACT = "ACT";
	public static final String SPECIALTY_STATUS_BAJ = "BAJ";

	public static final String PROFILE_STATUS_ACT = "ACT";
	public static final String PROFILE_STATUS_BAJ = "BAJ";
	public static final int PROFILE_TYPE_HCD = 1;

	public static final String DOCUMENT_STATUS_ACT = "ACT";
	public static final String DOCUMENT_STATUS_BAJ = "BAJ";

	public static final String OPERATOR_STATUS_ACT = "ACT";
	public static final String OPERATOR_STATUS_BAJ = "BAJ";

	public static final String PROFESSIONAL_STATUS_ACT = "ACT";
	public static final String PROFESSIONAL_STATUS_BAJ = "BAJ";

	public static final String ADMIN_PROFILE = "ADMIN";

	public static final String HEALTH_CENTER_HAS_OPERATOR_STATUS_ACT = "ACT";
	public static final String HEALTH_CENTER_HAS_OPERATOR_STATUS_BAJ = "BAJ";

	public static final String SERVICE_HAS_PROFESSIONAL_STATUS_ACT = "ACT";
	public static final String SERVICE_HAS_PROFESSIONAL_STATUS_BAJ = "BAJ";

	public static final String SERVICES_DISPLAY_STATUS_ACT = "ACT";
	public static final String SERVICES_DISPLAY_STATUS_BAJ = "BAJ";

	public static final String SERVICES_DISPLAY_SCHEDULE_STATUS_CALL = "CALL";
	public static final String SERVICES_DISPLAY_SCHEDULE_STATUS_START = "START";
	public static final String SERVICES_DISPLAY_SCHEDULE_STATUS_CANCEL = "CANCEL";

	/**
	 * Se cancela la planificación con turnos ACT,CON, FIN, CAN -> Se cancelan los
	 * turnos ACT por planificación.
	 */
	public static final String SERVICE_HAS_PROFESSIONAL_STATUS_CANCEL_PLANNING = "CANCEL_PLANNING";

	public static final String SERVICEPROVIDER_STATUS_ACT = "ACT";
	public static final String SERVICEPROVIDER_STATUS_BAJ = "BAJ";

	// Estados que maneja la api de hcd.
	public static final String PRESCRIPTION_STATUS_BAJ = "BAJ";
	public static final String PRESCRIPTION_STATUS_ACT = "ACT";
	public static final String PRESCRIPTION_STATUS_PEN = "PEN";
	public static final String PRESCRIPTION_STATUS_AUT = "AUT";
	public static final String PRESCRIPTION_STATUS_FIR = "FIR";

	// Estados que maneja la api de receta.
	public static final String PRESCRIPTION_STATUS_VEN = "VEN";
	public static final String PRESCRIPTION_STATUS_REC = "REC";
	public static final String PRESCRIPTION_STATUS_RES = "RES";
	public static final String PRESCRIPTION_STATUS_ENT = "ENT";

	// manejo de status para estudios complementarios
	public static final String PRESCRIPTION_STATUS_REQUEST = "REQ";
	public static final String PRESCRIPTION_STATUS_REALIZED = "REA";
	public static final String PRESCRIPTION_STATUS_COMPLETED = "FIN";

	public static final String PERMISSION_STATUS_BAJ = "BAJ";
	public static final String PERMISSION_STATUS_ACT = "ACT";

	public static final String PERMISSION_SCOPE_ALL = "ALL";
	public static final String PERMISSION_SCOPE_ONE = "ONE";

	public static final String SERVICES_SERVICE_DUPLICATED = "YA EXISTE UN SERVICIO CON ESE NOMBRE EN EL CENTRO DE SALUD ESPECIFICADO";

	public static final String DEFAULT_PROFILE_PROFESSIONAL = "PROFESSIONAL";
	public static final String PROFILE_PROFESSIONAL_ADMINISTRATIVO = "PROFESSIONAL_ADMINISTRATIVO";
	public static final String PROFILE_PROFESSIONAL_COORDINADOR = "PROFESSIONAL_COORDINADOR";
	public static final String PROFILE_PROFESSIONAL_COORD_ADMIN = "PROFESSIONAL_COORD_ADMIN";

	public static final List<String> PROFILES_PROFESSIONAL_LIST = Arrays.asList(
			ConstantConfig.DEFAULT_PROFILE_PROFESSIONAL, ConstantConfig.PROFILE_PROFESSIONAL_ADMINISTRATIVO,
			ConstantConfig.PROFILE_PROFESSIONAL_COORDINADOR, ConstantConfig.PROFILE_PROFESSIONAL_COORD_ADMIN);

	public static final String EXAMINATION_TYPE_BAJ = "BAJ";
	public static final String EXAMINATION_TYPE_ACT = "ACT";

	public static final String EXAMINATION_ITEM_BAJ = "BAJ";
	public static final String EXAMINATION_ITEM_ACT = "ACT";
	public static final Integer EXAMINATION_ITEM_TYPE_CLAP = 4;
	public static final String EXAMINATION_ITEM_TYPE_OPHTALMOLOGY = "OPHTALMOLOGY";
	public static final String EXAMINATION_ITEM_TYPE_ODONTOLOGY_GENERAL = "ODONTOLOGY_GENERAL";

	public static final String SERVICE_HAS_SPECIALTY_STATUS_ACT = "ACT";
	public static final String SERVICE_HAS_SPECIALTY_STATUS_BAJ = "BAJ";

	public static final String SERVICE_HAS_DISPLAY_STATUS_ACT = "ACT";
	public static final String SERVICE_HAS_DISPLAY_STATUS_BAJ = "BAJ";

	public static final String VACCINE_STATUS_BAJ = "BAJ";
	public static final String VACCINE_STATUS_ACT = "ACT";

	public static final String VACCINE_PERSON_GROUP_STATUS_BAJ = "BAJ";
	public static final String VACCINE_PERSON_GROUP_STATUS_ACT = "ACT";

	public static final String QUANTITY_CONSULTATION_FOR_PERCENTIL = "quantityConsultationForPercentil";
	public static final String YEARS_PERSON_FOR_PERCENTIL = "yearsPersonForPercentil";

	public static final String PERSON_HAS_VACCINE_STATUS_BAJ = "BAJ";
	public static final String PERSON_HAS_VACCINE_STATUS_ACT = "ACT";

	public static final String EXAMINATION_VALUE_STATUS_BAJ = "BAJ";
	public static final String EXAMINATION_VALUE_STATUS_ACT = "ACT";
	public static final String EXAMINATION_VALUE_STATUS_HECHO = "HEC";
	public static final String EXAMINATION_VALUE_STATUS_PENDING = "PEN";

	public static final List<String> EXAMINATION_VALUE_STATUS_VALID = Arrays.asList(EXAMINATION_VALUE_STATUS_BAJ,
			EXAMINATION_VALUE_STATUS_ACT, EXAMINATION_VALUE_STATUS_HECHO, EXAMINATION_VALUE_STATUS_PENDING);

	public static final String PROFESSIONAL_HAS_SPECIALTY_STATUS_ACT = "ACT";
	public static final String PROFESSIONAL_HAS_SPECIALTY_STATUS_BAJ = "BAJ";

	public static final String SERVICE_PROVIDER_HAS_OPERATOR_STATUS_BAJ = "BAJ";
	public static final String SERVICE_PROVIDER_HAS_OPERATOR_STATUS_ACT = "ACT";

	public static final String CODIGO_SERVICIO_DOSEP = "42.01.01";
	public static final String AJUSTE_DOSEP = "1";
	public static final String TIPO_PAGO_DOSEP = "CRE";

	public static final String RECIPE_VALIDITY_TIME = "recipeValidityTime";

	public static final String SYSTEM_TIMEZONE = "America/Argentina/Buenos_Aires";

	public static final String VADEMECUM_GENERICO = "VADEMECUMGENERICO";
	public static final String VADEMECUM_OFTALMOLOGIA = "VADEMECUMOFTALMOLOGIA";

	public static final String EMPTY_PLANNING = "EMPTY_PLANNING";

	public static final String WRONG_SERVICE = "WRONG_SERVICE";

	public static final String RESERVED = "RESERVED";

	public static final String DIAG = "DIAG";
	public static final String ADJ = "ADJ";
	public static final String ORDER = "ORDER";
	public static final String BILLING = "BILLING";
	public static final String PRE = "PRE";

	public static final String PER_TYPE_WEIGHT = "WEIGHT";
	public static final String PER_TYPE_HEIGHT = "HEIGHT";
	public static final String PER_TYPE_BRAIN_RADIO = "BRAIN_RADIO";
	public static final String PER_MAX = "P999";

	public static final String HEALTH_CENTER_INACTIVE_MESSAGE = "EL CENTRO DE SALUD SE ENCUENTRA DESHABILITADO";
	public static final String PROFESSIONAL_WITH_ASSIGNED_TURN = "EL PROFESIONAL POSEE TURNOS ASIGNADOS";
	public static final String MESSAGE_PROFILE_DEFAULT_UPDATE = "ESTE PERFIL NO SE PUEDE MODIFICAR";
	public static final String MESSAGE_PROFILE_DEFAULT_DELETE = "ESTE PERFIL NO SE PUEDE ELIMINAR";
	public static final String PERSON_WITH_ASSIGNED_TURN = "EL PACIENTE YA TIENE TURNO ASIGNADO EN ESTE HORARIO";
	public static final String VADEMECUM_TYPE_ODONTOGRAMA = "VADEMECUMODONTOLOGIA";
	public static final String VADEMECUM_TYPE_ODONTOLOGY_GRAL = "VADEMECUM_ODONTOLOGY_GRAL";
	public static final String EXAMINATION_TYPE_TEJ_BLANDO = "LESION_UBICACION";
	public static final String EXAMINATION_TYPE_PIEZA = "PIEZA";
	public static final String EXAMINATION_TYPE_CARE_AND_EDUCATION = "CARE_AND_EDUCATION";
	public static final String EXAMINATION_TYPE_KINESIOLOGY = "KINESIOLOGY";
	public static final String EXAMINATION_TYPE_PSYCHOLOGY = "PSYCHOLOGY";
	public static final String EXAMINATION_TYPE_PHYSIOTERAPY = "PHYSIOTERAPY";

	public static final String PRESCRIPTION_TYPE_MEDICINE = "MEDICINE";
	public static final String PRESCRIPTION_TYPE_PRACTICE = "PRACTICE";

	public static final String BENEFIT_TYPE_VADEMECUM_PREST = "P";
	public static final String BENEFIT_TYPE_VADEMECUM_MED = "M";
	public static final String BENEFIT_TYPE_VADEMECUM_OPH = "OP";

	public static final String BILLING_DOSEP = "DOSEP";
	public static final String BILLING_CIRCULO_MEDICO = "CIRCULO MEDICO";

	public static final String DIAGNOSIS_STATUS_ACT = "ACT";
	public static final String DIAGNOSIS_STATUS_BAJ = "BAJ";

	public static final String DIAGNOSIS_TYPE_CODE_DEF = "DEF";
	public static final String DIAGNOSIS_TYPE_CODE_PRE = "PRE";

	public static final String DIAGNOSIS_TYPE_DEF = "Definitivo";
	public static final String DIAGNOSIS_TYPE_PRE = "Presuntivo";

	public static final String CONSULTATION_MODULE_CODE_CLAP = "CLAP";

	public static final String NEARLEFT_CYLINDER = "NEARLEFT_CYLINDER";
	public static final String NEARLEFT_DEGREE = "NEARLEFT_DEGREE";
	public static final String NEARLEFT_SPHERE = "NEARLEFT_SPHERE";
	public static final String NEARRIGHT_CYLINDER = "NEARRIGHT_CYLINDER";
	public static final String NEARRIGHT_DEGREE = "NEARRIGHT_DEGREE";
	public static final String NEARRIGHT_SPHERE = "NEARRIGHT_SPHERE";
	public static final String FARLEFT_CYLINDER = "FARLEFT_CYLINDER";
	public static final String FARLEFT_DEGREE = "FARLEFT_DEGREE";
	public static final String FARLEFT_SPHERE = "FARLEFT_SPHERE";
	public static final String FARRIGHT_CYLINDER = "FARRIGHT_CYLINDER";
	public static final String FARRIGHT_DEGREE = "FARRIGHT_DEGREE";
	public static final String FARRIGHT_SPHERE = "FARRIGHT_SPHERE";

	public static final List<String> PRESCRIPTION_OPHTALMOLOGY_FAR_NEAR_CODES_LIST = Arrays.asList(NEARLEFT_CYLINDER,
			NEARLEFT_DEGREE, NEARLEFT_SPHERE, NEARRIGHT_CYLINDER, NEARRIGHT_DEGREE, NEARRIGHT_SPHERE, FARLEFT_CYLINDER,
			FARLEFT_DEGREE, FARLEFT_SPHERE, FARRIGHT_CYLINDER, FARRIGHT_DEGREE, FARRIGHT_SPHERE);

	public static final Map<String, String> MAP_PRESCRIPTION_OPHTALMOLOGY_NEAR = Collections
			.unmodifiableMap(new LinkedHashMap<String, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(NEARLEFT_SPHERE, "Ojo Izq. ESF.");
					put(NEARLEFT_CYLINDER, "Ojo Izq. CIL.");
					put(NEARLEFT_DEGREE, "Ojo Izq. Grados");

					put(NEARRIGHT_SPHERE, "Ojo Der. ESF.");
					put(NEARRIGHT_CYLINDER, "Ojo Der. CIL.");
					put(NEARRIGHT_DEGREE, "Ojo Der. Grados");

				}
			});

	public static final Map<String, String> MAP_PRESCRIPTION_OPHTALMOLOGY_FAR = Collections
			.unmodifiableMap(new LinkedHashMap<String, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(FARLEFT_SPHERE, "Ojo Izq. ESF.");
					put(FARLEFT_CYLINDER, "Ojo Izq. CIL.");
					put(FARLEFT_DEGREE, "Ojo Izq. Grados");

					put(FARRIGHT_SPHERE, "Ojo Der. ESF.");
					put(FARRIGHT_CYLINDER, "Ojo Der. CIL.");
					put(FARRIGHT_DEGREE, "Ojo Der. Grados");

				}
			});

	public static final String EXAMAMINATION_TYPE_STOMATOLOGY = "STOMATOLOGY";
	public static final String EXAMAMINATION_TYPE_ODONTOGRAMA = "ODONTOGRAMA";

	public static final String SILHOUETTE_MAN_GREY = "silhouette-man-grey.png";
	public static final String SILHOUETTE_WOMAN_GREY = "silhouette-woman-grey.png";

	public static final String SILHOUETTE_MAN_GREY_BASE64 = "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";
	public static final String SILHOUETTE_WOMAN_GREY_BASE64 = "iVBORw0KGgoAAAANSUhEUgAAAGEAAABkCAQAAAA8wpabAAAAAmJLR0QA/4ePzL8AAAAJcEhZcwAANsYAADbGAVshko8AAAAJdnBBZwAAAGEAAABkANfrz1UAAAV8SURBVHja1dtvaNVVHMfx9/3tzm3eu6153cw5NTe6bSrLhUtLs5akSysQA1Oxy6pRaikilURZ659Gfx7UA0GK0CcJIvSgKA06QiJLKBAsMUIzE23FCru6tfanB1e2qde78z2/3zl39/Nw3LN7Xvec359zvr9fiICjIEwti2milnIiJPmU9/iFbvroA2gK+BtDAXc/n0YSLKaKvME/93OWX+mki4uc5hCH6QqSERhBQYh6nmYZsYwfTLKbl+gMDhEIQQGMo5V1TNH4eD8f8iwXgkIEQFAQYi6vsHDY5MmcXt6mjX+DQXgBAAppZS+LtAEQZiNPEFKBEHyNggKIsZVWisSNfyfB/iDOTz4ICmAq77LMcCyPspLj/hHGE0kBVLOT5cb/41a2jXD2sklQAFXsYJGvb3+QTeT5PSLMD+cStvkEgMc6llz+QdwSFMBjrPAJACijjWq/v4MZYDabyA+AAA1socDPOJhNpEI2a12H9fIIC/1MJjFBAdzL0sAAUEyCQvPmJqMQZS3FARJgKSvNx0FIUAB3BX7LH+FVFpgi5KOQz2oiAROgijepNGsqJ9RzX+AAgHmsN7vxExEUwENUWCFAC40mk0k6CjHutwSAiWygQN5MSridGdYI8AB3ysdBQFAAzYy1SCglQVjaSDYKMeZZBAA0M9MuYTpxy4QJ8uuDNkEBzA/4qpwu4mNNMgr5NFoHwCzG2SOUM90BYQazZVNJQqhhkgNChFWylYiEUEfUAQGW0GCBoABudgKAch6WTCX9UQhT44gAjZILqD4hQpUzQg/9NghjKXVGaKfbBiFiYaGTPt0clmxT6hOiBlu/ZvmLU5KPSybSGEeEi1y0Q4jKb4MN08N/dggRZ4QzXLBDiAqqOP5ySHI+khDGB1vgvW7+4EtZ2USLoABucgKAAxyVNdAdhQJucQL4h92yg1mf0Cs7xIxzRHZZkxD6OO6E0E5S2kSL0ARwQnLrZZzz8gqo/hnpAr0OCD3yJvqEsoAKU5lja0NSAcx0cl24wd6GZIn1fbxUhBswEkKcOieEifLbGF1Cg8nvY0QQFw41CApgshMAlMs3enRHwUdRVZSY/MESXcIlR4RSplogNAF0OiIUUG9rc/43J9dmgAbpOUmXcI4uR4Qiaf1P9+PnnU2ln22tF/7krBNANwdtrReSnHBCOMw30ia6hAGOOACcYzt/WyE0AbTTYRnQw4t8ZXPJ8yNfWyaEmUGp/GZbcw2gAG7jE8t1514O8AGHSErGQnsZowCWs8v6Fn2Sb9nLfk4zoMeQ7JPmAT3WCVEWcg8n2cPH6pTOaGiNgoIQcZ4iQZllwFAG+IHt7KN7JMSIBAUhalhFwu8jsQa5xD52cYyOTJMqI0FBiGoeZTXVjjaF0zFO8jl7OEZvesZ1O6YAJtDC49RkrftDOc9n7OR7+q5lXKdzCvJpZgtznFUVdBgf8T4dVx/iaQgK4EY20+qwTKuXfg7yHN9dibiGoADm8BYLRsH0SZef2HhlEeWqbioIs4LXnRVETHKGJ/liCHEFQUERG3iBkmz3coScZM1QHWLYbZ6CYl6jbdQDoJp3hl4+GCQoKOENNprsLWchd7CZfDWcoKCIl1nrrLbsP2uYnzr5eJcBeTzD+hwCQBktqf56g08BP58jU2godzPtMgGoZKujnesgU5l6hs9TAMuYne3+GCRMAyg8IGr8lma2M4vC1ESqlT1UOYoSpyJFmJODx0EqFUwBjzzmZrsnxokSB4/x8jcGRlHqwGOaw+dPg0+cMR51o25hI0kVpR7TnTyYYCsVlHvOHia3k1ImefIK46hKIZM9a+8KukmYSi8H1miZEqLSc1bXt5VKL6eWOelSnpt3qMMTy31CWe4Tiv8HLJfzvpZ9NQMAAAAldEVYdGRhdGU6Y3JlYXRlADIwMTItMDctMTJUMTQ6Mzk6MzItMDc6MDB0zvhhAAAAJXRFWHRkYXRlOm1vZGlmeQAyMDEyLTA3LTEyVDE0OjM5OjMyLTA3OjAwBZNA3QAAABl0RVh0U29mdHdhcmUAd3d3Lmlua3NjYXBlLm9yZ5vuPBoAAAAASUVORK5CYII=";

	public static final String SCHEDULE_STATUS_LABEL_AGENDADA = "AGENDADA";
	public static final String SCHEDULE_STATUS_LABEL_AVAILABLE = "DISPONIBLE";
	public static final String SCHEDULE_STATUS_LABEL_EN_ESPERA = "EN ESPERA";
	public static final String SCHEDULE_STATUS_LABEL_ABIERTA = "ABIERTA";
	public static final String SCHEDULE_STATUS_LABEL_FIRMADA = "FIRMADA";
	public static final String SCHEDULE_STATUS_LABEL_CANCELADA = "CANCELADA";
	public static final String SCHEDULE_STATUS_LABEL_LLAMADA = "LLAMADA";

	public static final String SCHEDULE_STATUS_LABEL_COLOR_AGENDADA = "#555555";
	public static final String SCHEDULE_STATUS_LABEL_COLOR_EN_ESPERA = "#90FF82";
	public static final String SCHEDULE_STATUS_LABEL_COLOR_ABIERTA = "#39BAD0";
	public static final String SCHEDULE_STATUS_LABEL_COLOR_FIRMADA = "#D47E31";
	public static final String SCHEDULE_STATUS_LABEL_COLOR_CANCELADA = "#F44336";
	public static final String SCHEDULE_STATUS_LABEL_COLOR_LLAMADA = "#ffb20d";

	public static final String EXAMINATION_ITEM_PATHOLOGICAL_ANATOMY = "PATHOLOGICAL_ANATOMY";
	public static final String EXAMINATION_ITEM_STAGING = "STAGING";
	public static final String EXAMINATION_ITEM_TREATMENT = "TREATMENT";
	public static final String EXAMINATION_ITEM_ECOG_STATUS = "ECOG_STATUS";

	public static final String EXAMINATION_SUB_ITEM_PATHOLOGICAL_DIAGNOSIS_DATE = "PATHOLOGICAL_DIAGNOSIS_DATE";
	public static final String EXAMINATION_SUB_ITEM_STAGING_DATE = "STAGING_DATE";
	public static final String EXAMINATION_SUB_ITEM_TREATMENT_DATE_INIT = "TREATMENT_DATE_INIT";
	public static final String EXAMINATION_SUB_ITEM_TREATMENT_DATE_FIN = "TREATMENT_DATE_FIN";
	public static final String EXAMINATION_SUB_ITEM_ECOG_STATUS_DATE = "ECOG_STATUS_DATE";

	public static final String INT_REQUEST_STATUS_ACT = "ACT";
	public static final String INT_REQUEST_STATUS_BAJ = "BAJ";

	public static final String CACHEABLE_HEALTH_CENTER = "HealthCenter";
	public static final String CACHEABLE_SERVICES = "Services";
	public static final String CACHEABLE_OPERATOR = "Operator";
	public static final String CACHEABLE_PROFILE = "Profile";
	public static final String CACHEABLE_ROLE = "Role";

	public static final List<String> CACHEABLE_OPERATOR_LIST = Arrays.asList(CACHEABLE_OPERATOR, CACHEABLE_PROFILE,
			CACHEABLE_ROLE);

	public static final String PARSE_ENCODING_RENAPER = "PARSE_ENCODING_RENAPER";

	public static final String TEMPLATE_VERTICAL = "templateVertical";
	public static final String TEMPLATE_HORIZONTAL = "templateHorizontal";
	public static final String TEMPLATE_HORIZONTAL_LEGAL = "templateHorizontalLegal";

	public static final Map<String, String> MAP_PRESCRIPTION_STATUS = Collections
			.unmodifiableMap(new HashMap<String, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(null, "No reconocido");
					put(PRESCRIPTION_STATUS_VEN, "VENCIDA");
					put(PRESCRIPTION_STATUS_ACT, "RECETADA");
					put(PRESCRIPTION_STATUS_AUT, "AUTORIZADA");
					put(PRESCRIPTION_STATUS_ENT, "ENTREGADA");
					put(PRESCRIPTION_STATUS_FIR, "COMPLETADO Y ENTREGADO");
					put(PRESCRIPTION_STATUS_REC, "RECHAZADA");
					put(PRESCRIPTION_STATUS_RES, "RESERVADA");
					put(PRESCRIPTION_STATUS_BAJ, "CANCELADA");
					put(PRESCRIPTION_STATUS_PEN, "PENDIENTE DE AUTORIZACIÓN");
					put(PRESCRIPTION_STATUS_REQUEST, "SOLICITADA");
					put(PRESCRIPTION_STATUS_REALIZED, "REALIZADO");
					put(PRESCRIPTION_STATUS_COMPLETED, "COMPLETADO");
				}
			});

	public static final Map<String, String> MAP_VITAL_SIGNS = Collections
			.unmodifiableMap(new HashMap<String, String>() {
				private static final long serialVersionUID = 1L;
				{
					put("bloodPressure", "presión sanguínea");
					put("bodyMass", "Masa corporal");
					put("breathingFrecuency", "Frecuencia respiratoria");
					put("heartRate", "Frecuencia cardíaca");
					put("height", "altura");
					put("temperature", "Temperatura corporal");
					// put("brainRadio", "radio cerebral");
					put("glucemy", "glucemia");
					put("saturometry", "saturometría");
					put("weight", "peso");
					put("bodySurface", "superficie corporal");
				}
			});

	public static final Map<String, String> MAP_VITAL_SIGNS_UNIT = Collections
			.unmodifiableMap(new HashMap<String, String>() {
				private static final long serialVersionUID = 1L;
				{
					put("bloodPressure", "mmHg");
					put("bodyMass", "IMC");
					put("breathingFrecuency", "RPM");
					put("heartRate", "PPM");
					put("height", "CM");
					put("temperature", "°C");
					// put("brainRadio", "");
					put("glucemy", "mg/dL");
					put("saturometry", "%");
					put("weight", "KG");
					put("bodySurface", "M2");
				}
			});

	public static final List<String> VALUE_VITAL_SIGN_INVALID = Arrays.asList("0", "NaN", "NAN", "nan", "Infinity",
			"infinity", "INFINITY");

	public static final List<String> HIS_ORDER_REQUEST_KEYS = Arrays.asList("SOAP-ENV:Envelope", "SOAP-ENV:Body",
			"int:putOrderIntoRis", "orderRequest");
	public static final List<String> RIS_ORDER_ACKNOWLEGMENT_KEYS = Arrays.asList("soap:Envelope", "soap:Body",
			"acknowledgement");

	// RESULTADOS DE LOS ESTUDIOS COMPLEMENTARIOS
	public static final String COMPLEMENTARY_STUDY_RESULT_INTEGRATION_MANUAL = "MANUAL";
	public static final String COMPLEMENTARY_STUDY_RESULT_INTEGRATION_GE = "INTEGRATION_GE";

	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_COMPLETED = "COMPLETED";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_REALIZED = "REALIZED";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_DEACTIVE = "DEACTIVE";
	public static final List<String> COMPLEMENTARY_STUDY_RESULT_STATUS_FINAL = Arrays
			.asList(COMPLEMENTARY_STUDY_RESULT_STATUS_COMPLETED, COMPLEMENTARY_STUDY_RESULT_STATUS_REALIZED);

	// MANEJO DE GE
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED = "REQUIRED";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_CANCEL_REQUIRED = "CANCEL_REQUIRED";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_CANCEL_REQUIRED_ERROR = "CANCEL_REQUIRED_ERROR";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_PENDING_REQUIRED = "PENDING_REQUIRED";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_PENDING_REQUIRED_ERROR = "PENDING_REQ_ERROR";
	public static final List<String> COMPLEMENTARY_STUDY_RESULT_STATUS_FOR_APPOINTMENT_GE = Arrays.asList(
			COMPLEMENTARY_STUDY_RESULT_STATUS_PENDING_REQUIRED,
			COMPLEMENTARY_STUDY_RESULT_STATUS_PENDING_REQUIRED_ERROR);

	public static final Map<String, String> MAP_PRESCRIPTION_RESULT_STATUS = Collections
			.unmodifiableMap(new HashMap<String, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(null, "No reconocido");
					put(COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED,
							"El paciente debe ir al centro de salud a confirmar el turno");
					put(COMPLEMENTARY_STUDY_RESULT_STATUS_PENDING_REQUIRED,
							"Después de firmar la consulta vamos a solicitar el turno");
					put(COMPLEMENTARY_STUDY_RESULT_STATUS_PENDING_REQUIRED_ERROR,
							"Hemos tenido problemas al solicitar el turno");
				}
			});

	// Detalle de GE
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED_CONVENE = "CONVENE_APPOINTMENT";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED_RECEIVED = "RECEIVED_APPOINTMENT";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED_WAIT_RECEIVED = "WAIT_APPOINTMENT";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED_BEGIN = "BEGIN_APPOINTMENT";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED_WRITE = "WRITE_APPOINTMENT";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED_DICTATION = "DICTATION_APPOINTMENT";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED_ERASED = "ERASED_APPOINTMENT";

	// errores de GE
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_ERROR_PENDING_REQUIRED_NOT_CONSULTATION = "ERROR_PENDING_REQUIRED_NOT_CONSULTATION";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_ERROR_PENDING_REQUIRED_NOT_HEALTHCENTER = "ERROR_PENDING_REQUIRED_NOT_HEALTHCENTER";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_ERROR_PENDING_REQUIRED_NOT_PATIENT = "ERROR_PENDING_REQUIRED_NOT_PATIENT";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_ERROR_PENDING_REQUIRED_NOT_SECTION = "ERROR_PENDING_REQUIRED_NOT_SECTION";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_ERROR_PENDING_REQUIRED_NOT_COD_ITAL_HOSP = "ERROR_PENDING_REQUIRED_NOT_COD_ITAL_HOSP";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_ERROR_PENDING_REQUIRED_NOT_STUDY_GE = "ERROR_PENDING_REQUIRED_NOT_STUDY_GE";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_ERROR_PENDING_REQUIRED_RESPONSE_ERROR_GE = "ERROR_PENDING_REQUIRED_RESPONSE_ERROR_GE";
	public static final String COMPLEMENTARY_STUDY_RESULT_STATUS_ERROR_PENDING_REQUIRED_BAD_RESPONSE_GE = "ERROR_PENDING_REQUIRED_BAD_RESPONSE_GE";

	public static final Map<String, String> MAP_PRESCRIPTION_RESULT_STATUS_DETAIL = Collections
			.unmodifiableMap(new HashMap<String, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(null, "No reconocido");
					put(COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED_CONVENE, "Ya se ha asignado turno al paciente");
					put(COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED_RECEIVED, "Ya se ha asignado turno al paciente");
					put(COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED_WAIT_RECEIVED,
							"El paciente esta en espera para el estudio");
					put(COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED_BEGIN, "Se ha comenzado el estudio");
					put(COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED_WRITE, "Se esta elaborando el informe");
					put(COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED_DICTATION, "Se esta elaborando el informe");
					put(COMPLEMENTARY_STUDY_RESULT_STATUS_REQUIRED_ERASED,
							"Se ha borrado el turno del estudio en el centro de salud");
				}
			});

	public static final String REPORT_FINALIZED = "ACTIVE";
	public static final String REPORT_IN_PROCESS = "IN_PROCESS";

}