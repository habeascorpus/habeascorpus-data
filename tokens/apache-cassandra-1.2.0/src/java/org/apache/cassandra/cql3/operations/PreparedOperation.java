package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql3	TokenNameIdentifier
.	TokenNameDOT
operations	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collections	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql3	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
ColumnFamily	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
IColumn	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
.	TokenNameDOT
AbstractType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
.	TokenNameDOT
CollectionType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
.	TokenNameDOT
ListType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
.	TokenNameDOT
MapType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
.	TokenNameDOT
SetType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
exceptions	TokenNameIdentifier
.	TokenNameDOT
InvalidRequestException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
Pair	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
PreparedOperation	TokenNameIdentifier
implements	TokenNameimplements
Operation	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
enum	TokenNameenum
Kind	TokenNameIdentifier
{	TokenNameLBRACE
SET	TokenNameIdentifier
,	TokenNameCOMMA
PREPARED_PLUS	TokenNameIdentifier
,	TokenNameCOMMA
PLUS_PREPARED	TokenNameIdentifier
,	TokenNameCOMMA
MINUS_PREPARED	TokenNameIdentifier
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
Term	TokenNameIdentifier
preparedValue	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Kind	TokenNameIdentifier
kind	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
PreparedOperation	TokenNameIdentifier
(	TokenNameLPAREN
Term	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
Kind	TokenNameIdentifier
kind	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
value	TokenNameIdentifier
.	TokenNameDOT
isBindMarker	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
preparedValue	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
kind	TokenNameIdentifier
=	TokenNameEQUAL
kind	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
,	TokenNameCOMMA
ColumnNameBuilder	TokenNameIdentifier
builder	TokenNameIdentifier
,	TokenNameCOMMA
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
validator	TokenNameIdentifier
,	TokenNameCOMMA
UpdateParameters	TokenNameIdentifier
params	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Pair	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
,	TokenNameCOMMA
IColumn	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
list	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
validator	TokenNameIdentifier
instanceof	TokenNameinstanceof
CollectionType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
CollectionType	TokenNameIdentifier
)	TokenNameRPAREN
validator	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
kind	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
LIST	TokenNameIdentifier
:	TokenNameCOLON
switch	TokenNameswitch
(	TokenNameLPAREN
kind	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
SET	TokenNameIdentifier
:	TokenNameCOLON
ListOperation	TokenNameIdentifier
.	TokenNameDOT
doSetFromPrepared	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
ListType	TokenNameIdentifier
)	TokenNameRPAREN
validator	TokenNameIdentifier
,	TokenNameCOMMA
preparedValue	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
PREPARED_PLUS	TokenNameIdentifier
:	TokenNameCOLON
ListOperation	TokenNameIdentifier
.	TokenNameDOT
doPrependFromPrepared	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
ListType	TokenNameIdentifier
)	TokenNameRPAREN
validator	TokenNameIdentifier
,	TokenNameCOMMA
preparedValue	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
PLUS_PREPARED	TokenNameIdentifier
:	TokenNameCOLON
ListOperation	TokenNameIdentifier
.	TokenNameDOT
doAppendFromPrepared	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
ListType	TokenNameIdentifier
)	TokenNameRPAREN
validator	TokenNameIdentifier
,	TokenNameCOMMA
preparedValue	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
MINUS_PREPARED	TokenNameIdentifier
:	TokenNameCOLON
ListOperation	TokenNameIdentifier
.	TokenNameDOT
doDiscardFromPrepared	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
ListType	TokenNameIdentifier
)	TokenNameRPAREN
validator	TokenNameIdentifier
,	TokenNameCOMMA
preparedValue	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
,	TokenNameCOMMA
list	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
SET	TokenNameIdentifier
:	TokenNameCOLON
switch	TokenNameswitch
(	TokenNameLPAREN
kind	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
SET	TokenNameIdentifier
:	TokenNameCOLON
SetOperation	TokenNameIdentifier
.	TokenNameDOT
doSetFromPrepared	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
SetType	TokenNameIdentifier
)	TokenNameRPAREN
validator	TokenNameIdentifier
,	TokenNameCOMMA
preparedValue	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
PREPARED_PLUS	TokenNameIdentifier
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"Unsupported syntax, cannot add to a prepared set"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
PLUS_PREPARED	TokenNameIdentifier
:	TokenNameCOLON
SetOperation	TokenNameIdentifier
.	TokenNameDOT
doAddFromPrepared	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
SetType	TokenNameIdentifier
)	TokenNameRPAREN
validator	TokenNameIdentifier
,	TokenNameCOMMA
preparedValue	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
MINUS_PREPARED	TokenNameIdentifier
:	TokenNameCOLON
SetOperation	TokenNameIdentifier
.	TokenNameDOT
doDiscardFromPrepared	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
SetType	TokenNameIdentifier
)	TokenNameRPAREN
validator	TokenNameIdentifier
,	TokenNameCOMMA
preparedValue	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
MAP	TokenNameIdentifier
:	TokenNameCOLON
switch	TokenNameswitch
(	TokenNameLPAREN
kind	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
SET	TokenNameIdentifier
:	TokenNameCOLON
MapOperation	TokenNameIdentifier
.	TokenNameDOT
doSetFromPrepared	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
MapType	TokenNameIdentifier
)	TokenNameRPAREN
validator	TokenNameIdentifier
,	TokenNameCOMMA
preparedValue	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
PREPARED_PLUS	TokenNameIdentifier
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"Unsupported syntax, cannot put to a prepared map"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
PLUS_PREPARED	TokenNameIdentifier
:	TokenNameCOLON
MapOperation	TokenNameIdentifier
.	TokenNameDOT
doPutFromPrepared	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
MapType	TokenNameIdentifier
)	TokenNameRPAREN
validator	TokenNameIdentifier
,	TokenNameCOMMA
preparedValue	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
MINUS_PREPARED	TokenNameIdentifier
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"Unsuppoted syntax, discard syntax for map not supported"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
kind	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
SET	TokenNameIdentifier
:	TokenNameCOLON
ColumnOperation	TokenNameIdentifier
.	TokenNameDOT
Set	TokenNameIdentifier
(	TokenNameLPAREN
preparedValue	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
,	TokenNameCOMMA
validator	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
PREPARED_PLUS	TokenNameIdentifier
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"Unsupported syntax for increment, must be of the form X = X + <value>"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
PLUS_PREPARED	TokenNameIdentifier
:	TokenNameCOLON
ColumnOperation	TokenNameIdentifier
.	TokenNameDOT
CounterInc	TokenNameIdentifier
(	TokenNameLPAREN
preparedValue	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
,	TokenNameCOMMA
validator	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
MINUS_PREPARED	TokenNameIdentifier
:	TokenNameCOLON
ColumnOperation	TokenNameIdentifier
.	TokenNameDOT
CounterDec	TokenNameIdentifier
(	TokenNameLPAREN
preparedValue	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
,	TokenNameCOMMA
validator	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addBoundNames	TokenNameIdentifier
(	TokenNameLPAREN
ColumnSpecification	TokenNameIdentifier
column	TokenNameIdentifier
,	TokenNameCOMMA
ColumnSpecification	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
boundNames	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
preparedValue	TokenNameIdentifier
.	TokenNameDOT
isBindMarker	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
boundNames	TokenNameIdentifier
[	TokenNameLBRACKET
preparedValue	TokenNameIdentifier
.	TokenNameDOT
bindIndex	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
column	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
getValues	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Collections	TokenNameIdentifier
.	TokenNameDOT
singletonList	TokenNameIdentifier
(	TokenNameLPAREN
preparedValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
requiresRead	TokenNameIdentifier
(	TokenNameLPAREN
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
validator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
validator	TokenNameIdentifier
instanceof	TokenNameinstanceof
ListType	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
kind	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Kind	TokenNameIdentifier
.	TokenNameDOT
MINUS_PREPARED	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isPotentialCounterOperation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
kind	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Kind	TokenNameIdentifier
.	TokenNameDOT
PLUS_PREPARED	TokenNameIdentifier
||	TokenNameOR_OR
kind	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Kind	TokenNameIdentifier
.	TokenNameDOT
MINUS_PREPARED	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Type	TokenNameIdentifier
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Type	TokenNameIdentifier
.	TokenNameDOT
PREPARED	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
