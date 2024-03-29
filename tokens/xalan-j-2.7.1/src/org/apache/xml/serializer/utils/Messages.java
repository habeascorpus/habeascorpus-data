package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ListResourceBundle	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Locale	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
MissingResourceException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ResourceBundle	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
Messages	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
Locale	TokenNameIdentifier
m_locale	TokenNameIdentifier
=	TokenNameEQUAL
Locale	TokenNameIdentifier
.	TokenNameDOT
getDefault	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
ListResourceBundle	TokenNameIdentifier
m_resourceBundle	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
m_resourceBundleName	TokenNameIdentifier
;	TokenNameSEMICOLON
Messages	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
resourceBundle	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_resourceBundleName	TokenNameIdentifier
=	TokenNameEQUAL
resourceBundle	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Locale	TokenNameIdentifier
getLocale	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_locale	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
ListResourceBundle	TokenNameIdentifier
getResourceBundle	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_resourceBundle	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
String	TokenNameIdentifier
createMessage	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
msgKey	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
args	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_resourceBundle	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
m_resourceBundle	TokenNameIdentifier
=	TokenNameEQUAL
loadResourceBundle	TokenNameIdentifier
(	TokenNameLPAREN
m_resourceBundleName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
m_resourceBundle	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
createMsg	TokenNameIdentifier
(	TokenNameLPAREN
m_resourceBundle	TokenNameIdentifier
,	TokenNameCOMMA
msgKey	TokenNameIdentifier
,	TokenNameCOMMA
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
return	TokenNamereturn
"Could not load the resource bundles: "	TokenNameStringLiteral
+	TokenNamePLUS
m_resourceBundleName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
createMsg	TokenNameIdentifier
(	TokenNameLPAREN
ListResourceBundle	TokenNameIdentifier
fResourceBundle	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
msgKey	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
args	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
fmsg	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
boolean	TokenNameboolean
throwex	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
String	TokenNameIdentifier
msg	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
msgKey	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
msg	TokenNameIdentifier
=	TokenNameEQUAL
fResourceBundle	TokenNameIdentifier
.	TokenNameDOT
getString	TokenNameIdentifier
(	TokenNameLPAREN
msgKey	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
msgKey	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
msg	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throwex	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
msg	TokenNameIdentifier
=	TokenNameEQUAL
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
MessageFormat	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
MsgKey	TokenNameIdentifier
.	TokenNameDOT
BAD_MSGKEY	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
msgKey	TokenNameIdentifier
,	TokenNameCOMMA
m_resourceBundleName	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
msg	TokenNameIdentifier
=	TokenNameEQUAL
"The message key '"	TokenNameStringLiteral
+	TokenNamePLUS
msgKey	TokenNameIdentifier
+	TokenNamePLUS
"' is not in the message class '"	TokenNameStringLiteral
+	TokenNamePLUS
m_resourceBundleName	TokenNameIdentifier
+	TokenNamePLUS
"'"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
args	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
n	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
args	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
args	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
fmsg	TokenNameIdentifier
=	TokenNameEQUAL
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
MessageFormat	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
,	TokenNameCOMMA
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throwex	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
fmsg	TokenNameIdentifier
=	TokenNameEQUAL
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
MessageFormat	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
MsgKey	TokenNameIdentifier
.	TokenNameDOT
BAD_MSGFORMAT	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
msgKey	TokenNameIdentifier
,	TokenNameCOMMA
m_resourceBundleName	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fmsg	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
" "	TokenNameStringLiteral
+	TokenNamePLUS
msg	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
formatfailed	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fmsg	TokenNameIdentifier
=	TokenNameEQUAL
"The format of message '"	TokenNameStringLiteral
+	TokenNamePLUS
msgKey	TokenNameIdentifier
+	TokenNamePLUS
"' in message class '"	TokenNameStringLiteral
+	TokenNamePLUS
m_resourceBundleName	TokenNameIdentifier
+	TokenNamePLUS
"' failed."	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
fmsg	TokenNameIdentifier
=	TokenNameEQUAL
msg	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
throwex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
fmsg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
fmsg	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
ListResourceBundle	TokenNameIdentifier
loadResourceBundle	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
resourceBundle	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
MissingResourceException	TokenNameIdentifier
{	TokenNameLBRACE
m_resourceBundleName	TokenNameIdentifier
=	TokenNameEQUAL
resourceBundle	TokenNameIdentifier
;	TokenNameSEMICOLON
Locale	TokenNameIdentifier
locale	TokenNameIdentifier
=	TokenNameEQUAL
getLocale	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ListResourceBundle	TokenNameIdentifier
lrb	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
ResourceBundle	TokenNameIdentifier
rb	TokenNameIdentifier
=	TokenNameEQUAL
ResourceBundle	TokenNameIdentifier
.	TokenNameDOT
getBundle	TokenNameIdentifier
(	TokenNameLPAREN
m_resourceBundleName	TokenNameIdentifier
,	TokenNameCOMMA
locale	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lrb	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ListResourceBundle	TokenNameIdentifier
)	TokenNameRPAREN
rb	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
MissingResourceException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
lrb	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ListResourceBundle	TokenNameIdentifier
)	TokenNameRPAREN
ResourceBundle	TokenNameIdentifier
.	TokenNameDOT
getBundle	TokenNameIdentifier
(	TokenNameLPAREN
m_resourceBundleName	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Locale	TokenNameIdentifier
(	TokenNameLPAREN
"en"	TokenNameStringLiteral
,	TokenNameCOMMA
"US"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
MissingResourceException	TokenNameIdentifier
e2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
MissingResourceException	TokenNameIdentifier
(	TokenNameLPAREN
"Could not load any resource bundles."	TokenNameStringLiteral
+	TokenNamePLUS
m_resourceBundleName	TokenNameIdentifier
,	TokenNameCOMMA
m_resourceBundleName	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
m_resourceBundle	TokenNameIdentifier
=	TokenNameEQUAL
lrb	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
lrb	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
getResourceSuffix	TokenNameIdentifier
(	TokenNameLPAREN
Locale	TokenNameIdentifier
locale	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
suffix	TokenNameIdentifier
=	TokenNameEQUAL
"_"	TokenNameStringLiteral
+	TokenNamePLUS
locale	TokenNameIdentifier
.	TokenNameDOT
getLanguage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
country	TokenNameIdentifier
=	TokenNameEQUAL
locale	TokenNameIdentifier
.	TokenNameDOT
getCountry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
country	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"TW"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
suffix	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
"_"	TokenNameStringLiteral
+	TokenNamePLUS
country	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
suffix	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
