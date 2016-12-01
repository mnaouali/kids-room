/**
 * Created by shuk on 19.11.16.
 */
messages = {
	kid : {
		invalidFirstName : "Ви ввели ім'я невірно",
		invalidLastName : 'Ви ввели прізвище невірно',
		requiredFirstName: "Вкажіть будь ласка ім'я дитини", 
		requiredLastName: "Вкажіть будь ласка прізвище дитини",
		regexKidFirstName: 'Для вводу імені використовуйте лише літери',
		regexKidLastName: 'Для вводу прізвища використовуйте лише літери',
		editFirstName : "Будь ласка, введіть не менше 2 символів.",
		editLastName : "Будь ласка, введіть не менше 2 символів."
	},
    date: {
        fromBiggerThanTo:  "Початкова дата не повинна перевищувати кінцеву",
        startEventDate: "Початок: ",
        endEventDate: "Кінець: "
    },
    info: {
        description: "Опис: ",
        noDescription: "Ця подія немає опису",
        fromBiggerThanTo:  "Початкова дата не повинна перевищувати кінцеву"
    },
	dateTable: {
		emptyTable: "Немає даних в таблиці",
		processing: "Зачекайте...",
		search: "Пошук:",
		lengthMenu: "Показати _MENU_ записів",
		info: "Записи з _START_ по _END_ із _TOTAL_ записів",
		infoEmpty: "Записи з 0 по 0 із 0 записів",
		infoFiltered: "(відфільтровано з _MAX_ записів)",
		loadingRecords: "Завантаження...",
		zeroRecords: "Записи відсутні",
		paginate: {
			first: "Перша",
			previous: "Попередня",
			next: "Наступна",
			last: "Остання"
		},
        aria: {
			sortAscending:  ": активувати для сортування стовпців за зростанням",
			sortDescending: ": активувати для сортування стовпців за спаданням"
		}
	},
	modal:
	{
		kid: {
			comment: "Коментарій",
			choose: "Будь ласка виберіть дитину"
		}
	},
	event: {
		errors: {
			dateInThePast: "Дата не може бути в минулому, поточна дата: ",
			timeInThePast: "Час початку не може бути в минулому, поточний час: ",
			endTimeGreaterThanStartTime: "Час закінчення повинен бути хоча б на хвилину більший за час початку",
			minimalDatesDifference: "Повторювані: Дата закінчення повинна бути хоча б на день більшою за дату початку",
			emptyTitle: "Назва повинна бути заповнена",
			noDaysSelected: "Повторювані: Як мінімум один день повинен бути вибраним",
			noKidsSelected: "Як мінімум одна дитина повинна бути вибрана",
			bookingTypeMismatchWhenUpdating: "Неможливо перетворити щотижневе бронювання в одноденне",
			incorrectData: "Невірні дані: "
		}
    },
	notCorrect: {
		time: '<b>невідомо</b>. Введено неправильний час. Допустимий формат: <b>HH:mm</b>',
		startDate: 'Введено неправильну початкову дату. Допустимий формат: <b>dd:MM:YYYY</b>',
		endDate: 'Введено неправильну кінцеву дату. Допустимий формат: <b>dd:MM:YYYY</b>',
		server: '<b>невідомо</b>. Помилка сервера',
		emptyStartDate: "Не введено початкову дату",
		emptyEndDate: "Не введено кінцеву дату",
		pastStartDay: "Початкова дата на може бути в минулому",
		pastEndDay: "Кінцева дата не може бути меншою за початкову",
		wrongDateStartRange: 'Початкова дата є поза межами вибраних заходів',
		wrongDateEndRange: 'Кінцева дата є поза межами вибраних заходів'
	}
};
